package contest;

public class MinMax {
	public static void main(String[] args) {
		MinMax mm = new MinMax();
		int[] nums = {3};
		System.out.println(mm.minMaxGame(nums));
	}
	
	public int minMaxGame(int[] nums) {
		return half(nums)[0];
	}
	
	private int[] half(int[] nums) {
		if (nums.length <= 1) return nums;
		
		int[] newNums = new int[nums.length / 2];
		
		for (int i = 0; i < newNums.length; i++) {
			if (i % 2 == 0) {
				newNums[i] = Math.min(nums[2*i], nums[2*i + 1]);
			} else {
				newNums[i] = Math.max(nums[2*i], nums[2*i + 1]);
			}
		}
		
		return half(newNums);
	}
}
