package contest;

public class ReplaceElement {
	public static void main(String[] args) {
		int[] nums = {1,2};
		int[][] operations = {{1,3},{2,1},{3,2}};
		ReplaceElement re = new ReplaceElement();
		int[] result = re.arrayChange(nums, operations);
		
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
	}
	
	public int[] arrayChange(int[] nums, int[][] operations) {
		for (int i = 0; i < operations.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				if(nums[j] == operations[i][0]) {
					nums[j] = operations[i][1];
					break;
				}
			}
		}
		return nums;
	}
}
