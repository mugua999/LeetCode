
public class RotateArrayWithCyclicRep {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7};
		rotate(arr,3);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void rotate(int[] nums, int k) {
		k = k % nums.length;
		int count = 0;
		for (int start = 0; count < nums.length; start++) {
			int current = start;
			int prev = nums[start];
			do {
				int next = (current + k) % nums.length;
				int temp = nums[next];
				nums[next] = prev;
				prev = temp;
				current = next;
				count++;
				for (int i = 0; i < nums.length; i++) {
					System.out.print(nums[i] + " ");
				}
				System.out.println();
			} while (start != current);
		}
	}

}
