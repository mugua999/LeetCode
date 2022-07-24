
public class RotateArray {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7};
		rotate(arr,3);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void rotate(int[] nums, int k) {
		int length = nums.length;
		int[] ans = new int[length];
		
		for (int i = 0; i < length; i++) {
			ans[(i+k)%length] = nums[i];
		}
		
		for (int i = 0; i < ans.length; i++) {
			nums[i] = ans[i];
		}
	}
}
