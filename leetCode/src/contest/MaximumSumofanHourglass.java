package contest;

public class MaximumSumofanHourglass {
	public static void main(String[] args) {
		int[][] grid = {{520626,685427,788912,800638,717251,683428},
		                {23602,608915,697585,957500,154778,209236},
		                {287585,588801,818234,73530,939116,252369}};
		
		MaximumSumofanHourglass max = new MaximumSumofanHourglass();
		
		System.out.println(max.maxSum(grid));
	}
	
	public int maxSum(int[][] grid) {
		int max = 0;

		for (int i = 1; i < grid.length - 1; i++) {
			for (int j = 1; j < grid[0].length - 1; j++) {
				int sum = 0;

				sum = grid[i][j] + grid[i - 1][j - 1] + grid[i - 1][j] + grid[i - 1][j + 1] + grid[i + 1][j - 1]
						+ grid[i + 1][j] + grid[i + 1][j + 1];
				
				max = (sum > max) ? sum : max;
			}
		}
		
		return max;
	}
}
