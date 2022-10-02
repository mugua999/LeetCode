package contest;

import java.util.ArrayList;
import java.util.List;

public class FindAllGoodIndices {
    public List<Integer> goodIndices(int[] nums, int k) {
        List<Integer> ans = new ArrayList<>();
        
        for(int i = k; i < nums.length - k; i++) {
        	boolean good = true;
        	
        	for(int j = i - 1; j > i - k; j--) {
        		if(nums[j] > nums[j-1]) good = false;
        	}
        	
        	for(int j = i + 1; j < i + k; j++) {
        		if(nums[j] > nums[j+1]) good = false;
        	}
        	
        	if (good) ans.add(i);
        }
        
        return ans;
    }
}
