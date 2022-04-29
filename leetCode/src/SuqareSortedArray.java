import java.util.Arrays;

public class SuqareSortedArray {
	public static void main(String[] args) {
		int[] nums = { -4, -1, 0, 3, 10 };
		nums = sortedSquares(nums);
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}

	public static int[] sortedSquares(int[] nums) {
		int n = nums.length;
		int[] ans = new int[n];

		int right = n - 1;
		int left = 0;

		for (int i = n - 1; i >= 0; i--) {
			if (Math.abs(nums[right]) > Math.abs(nums[left])) {
				ans[i] = nums[right] * nums[right];
				right--;
			} else {
				ans[i] = nums[left] * nums[left];
				left++;
			}
		}
		
		return ans;
	}
}
