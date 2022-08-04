package contest;

import java.util.HashSet;
import java.util.Set;

public class SubtractingEqualAmount {
	public static void main(String[] args) {
		SubtractingEqualAmount sea = new SubtractingEqualAmount();
		int[] nums = {};
		
		System.out.println(sea.minimumOperations(nums));
		
	}
	
    public int minimumOperations(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int count = 0;
        
        for (int i = 0; i < nums.length; i++) {
			set.add(nums[i]);
		}
        
        if (set.contains(0)) {
        	count = set.size() - 1;
        } else {
        	count = set.size();
        }
        
        return count;
    }
}
