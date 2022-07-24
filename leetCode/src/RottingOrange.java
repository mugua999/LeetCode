import java.util.ArrayList;
import java.util.List;

public class RottingOrange {
	int[][] grid;
	boolean[][] rott;
	
	public static void main(String[] args) {
		int[][] grid = {{2,1,1},{1,1,0},{0,1,1}};
		RottingOrange ro = new RottingOrange();
		System.out.println(ro.orangesRotting(grid));
	}

	public int orangesRotting(int[][] grid) {
		this.grid = grid;
		List<int[]> rotten = new ArrayList<>();
		rott = new boolean[grid.length][grid[0].length];

		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if (grid[i][j] == 2) {
					int[] index = { i, j };
					rotten.add(index);
				}
			}
		}

		int count = rot(rotten.get(0)[0], rotten.get(0)[1]);
		return count;
	}

	private int rot(int r, int c) {
		if (r< 0 || r >= grid.length || c < 0 || c >= grid[0].length
				|| rott[r][c] || grid[r][c] == 0) {
			return 0;
		}
		
		grid[r][c] = 2;
		rott[r][c] = true;
		return 1 + (((rot(r-1,c) + rot(r+1,c) + rot(r,c-1) + rot(r,c+1)) > 0) ? 1 : 0);
	}
}
