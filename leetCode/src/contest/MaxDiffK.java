package contest;

import java.util.Arrays;

public class MaxDiffK {
	public static void main(String[] args) {
		int[] nums = {1,2,3,7,9,10};
		
		MaxDiffK md = new MaxDiffK();
		System.out.println(md.partitionArray(nums, 2));
	}
	
	public int partitionArray(int[] nums, int k) {
		int left = 0, right = 1, count = 0;
		
		Arrays.sort(nums);
		
		while (right < nums.length) {
			if (nums[right] - nums[left] > k) {
				count++;
				left = right;
			}
			right++;
		}
		
		return count + 1;
	}
}
