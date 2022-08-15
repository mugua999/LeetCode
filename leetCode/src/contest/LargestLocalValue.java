package contest;

public class LargestLocalValue {
	public static void main(String[] args) {
		int[][] grid = {{1,1,1,1,1},{1,1,1,1,1},{1,1,2,1,1},{1,1,1,1,1},{1,1,1,1,1}};
		LargestLocalValue llv = new LargestLocalValue();
		
		int[][] res = llv.largestLocal(grid);
		
		for (int i = 0; i < res.length; i++) {
			for (int j = 0; j < res[0].length; j++) {
				System.out.print(res[i][j] + " ");
			}
			System.out.println();
		}
	}
	
    public int[][] largestLocal(int[][] grid) {
    	int n = grid.length;
        int[][] ans = new int[n - 2][n - 2];
        
        for (int i = 0; i < ans.length; i++) {
			for (int j = 0; j < ans[0].length; j++) {
				int max = 0;
				for (int k = 0; k < 3; k++) {
					for (int k2 = 0; k2 < 3; k2++) {
						if (grid[i + k][j + k2] > max) {
							max = grid[i + k][j + k2];
						}
					}
				}
				ans[i][j] = max;
			}
		}
        
        return ans;
    }
}
