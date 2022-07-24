package contest;

import java.util.HashMap;
import java.util.Map;

public class NoPairs {
	public static void main(String[] args) {
		NoPairs np = new NoPairs();
		int[] nums = {0};
		
		int[] ans = np.numberOfPairs(nums);
		
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}
	}
	
    public int[] numberOfPairs(int[] nums) {
    	Map<Integer,Integer> uniNo = new HashMap<>();
    	
    	for (int i = 0; i < nums.length; i++) {
			if (uniNo.containsKey(nums[i])) {
				uniNo.replace(nums[i], uniNo.get(nums[i]) + 1);
			} else {
				uniNo.put(nums[i], 1);
			}
		}
    	
    	int pairs = 0, left = 0;
    	
    	for (Map.Entry<Integer, Integer> entry : uniNo.entrySet()) {
			Integer val = entry.getValue();
			
			int thisPair = val / 2;
			int thisLeft = val % 2;
			
			pairs += thisPair;
			left += thisLeft;
		}
    	
    	int[] ans = {pairs, left};
    	
    	return ans;
    }
}
