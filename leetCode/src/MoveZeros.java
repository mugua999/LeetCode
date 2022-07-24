
public class MoveZeros {
	public static void main(String[] args) {
		int[] nums = {0,1,0,3,12};
		moveZeroes(nums);
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}

	public static void moveZeroes(int[] nums) {
		int length = nums.length;
		int count = 0;
		int[] nonZero = new int[length];
		
		for (int i = 0; i < length; i++) {
			nonZero[i] = 0;
		}
		
		for (int i = 0; i < length; i++) {
			if (nums[i] != 0) {
				nonZero[count++] = nums[i];
				//count++;
			}
		}
		
		for (int i = 0; i < length; i++) {
			nums[i] = nonZero[i];
		}
	}
}
