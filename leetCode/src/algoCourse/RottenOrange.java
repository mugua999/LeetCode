package algoCourse;

import java.util.LinkedList;
import java.util.Queue;

public class RottenOrange {
	public static void main(String[] args) {
		int[][] grid = {{1,2}};
		RottenOrange ro = new RottenOrange();
		
		System.out.println(ro.orangesRotting(grid));
	}
	
    public int orangesRotting(int[][] grid) {
        Queue<int[]> q = new LinkedList<>();
        
        for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if (grid[i][j] == 2) {
					int[] node = {i, j};
					q.add(node);
				}
			}
		}
        
        while (!q.isEmpty()) {
        	int[] popNode = q.poll();
        	int r = popNode[0], c = popNode[1], wave = grid[r][c];
        	
        	if (r - 1 >= 0 && grid[r - 1][c] == 1) {
        		grid[r-1][c] = wave + 1;
        		int[] node = {r-1,c};
        		q.add(node);
        	}
        	if (r + 1 < grid.length && grid[r + 1][c] == 1) {
        		grid[r+1][c] = wave + 1;
        		int[] node = {r+1,c};
        		q.add(node);
        	}
        	if (c - 1 >= 0 && grid[r][c - 1] == 1) {
        		grid[r][c - 1] = wave + 1;
        		int[] node = {r,c - 1};
        		q.add(node);
        	}
        	if (c + 1 < grid[0].length && grid[r][c + 1] == 1) {
        		grid[r][c + 1] = wave + 1;
        		int[] node = {r,c + 1};
        		q.add(node);
        	}
        }
        
        int max = 0;
        for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if (grid[i][j] == 1) return -1;
				max = (grid[i][j] > max) ? grid[i][j] : max;
			}
		}
        
        return (max == 0) ? max : max - 2;
    }
}
