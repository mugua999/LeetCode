package contest;

import java.util.Iterator;

public class ApplyOperationstoanArray {
    public int[] applyOperations(int[] nums) {
    	
    	int[] res = new int[nums.length];
    	
    	for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == nums[i+1]) {
				nums[i] *= 2;
				nums[i+1] = 0;
			}
		}
    	
    	int pointer = 0;
    	for (int i = 0; i < nums.length; i++) {
			if(nums[i] != 0) {
				res[pointer] = nums[i];
				pointer++;
			}
		}
    	
    	return res;
    }
}
