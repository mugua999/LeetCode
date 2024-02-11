package contest;

import java.util.Arrays;
import java.util.stream.Collectors;

public class DivideArrayIntoArraysWithMaxDifference {
	public static void main(String[] args) {
		int[] nums = {4,2,9,8,2,12,7,12,10,5,8,5,5,7,9,2,5,11};
		int[][] ans = divideArray(nums, 14);
		
		 Arrays.stream(ans).forEach(row -> System.out.println(Arrays.toString(row)));
		
	}
	
	public static int[][] divideArray(int[] nums, int k) {
		Arrays.sort(nums);
		int[][] res = new int[nums.length / 3][3];

		int pointer = 0, rowNo = 0;

		while (pointer < nums.length - 1) {
			if(nums[pointer] + k >= nums[pointer + 2]) {
				res[rowNo][0] = nums[pointer];
				res[rowNo][1] = nums[pointer+1];
				res[rowNo][2] = nums[pointer+2];
				pointer += 3;
				rowNo++;
			} else {
				int[][] ans = new int[0][0];
				return ans;
			}
		}
		
		return res;
	}
}
