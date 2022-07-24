
public class TwoSumVersion2 {

	public static void main(String[] args) {
		int[] nums = {2,3,5,7};
		int[] ans = twoSum(nums,8);
		
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}
	}
	
	//array is sorted in advance, can only use constant extra space
	public static int[] twoSum(int[] numbers, int target) {
		int[] ans = new int[2];
		int sum, left = 0, right = numbers.length - 1;
		
		do {
			sum = numbers[left] + numbers[right];
			if (sum == target) {
				ans[0] = left;
				ans[1] = right;
			}
			if (sum < target) left++;
			else right--;
		}while (sum != target);
		
		return ans;
	}

}
