

public class TwoSum {
	public static void main(String[] args) {
		int[] nums = {2,3,5,7};
		int[] ans = twoSum(nums,7);
		
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}
	}

	public static int[] twoSum(int[] nums, int target) {
		int[] ans = {-1,-1};
		for (int i = 0; i < nums.length; i++) {
			for(int j=i+1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					ans[0] = i;
					ans[1] = j;
					return ans;
				}
			}
		}
		return ans;
	}
}
