package contest;

import java.util.ArrayList;
import java.util.List;

//wrong answer lol
public class MinPass {
	public static void main(String[] args) {
		int[][] grid = {{5,3},{4,0},{2,1}};
		int[][] moveCost = {{9,8},{1,5},{10,12},{18,6},{2,4},{14,3}};
		MinPass mp = new MinPass();
		int cost = mp.minPathCost(grid,moveCost);
		
		System.out.println(cost);
	}
	
    public int minPathCost(int[][] grid, int[][] moveCost) {
        int[] start = findStart(grid,moveCost);
        int routeVal = findRoute(grid,moveCost,start,1);
        
        int totalCost = grid[0][start[1]] + moveCost[grid[0][start[1]]][start[2]] + routeVal;
        
        return totalCost;
    }
    
    public int[] findStart(int[][] grid, int[][] moveCost) {
    	int[] minStart = new int[3];
    	int min = Integer.MAX_VALUE;
    	
    	for (int i = 0; i < grid[0].length; i++) {
			for (int j = 0; j < moveCost[grid[0][i]].length; j++) {
				int length = grid[0][i] + moveCost[grid[0][i]][j];
				if (length < min) {
					min = length;
					int[] temp = {0,i,j};
					minStart = temp;
				}
			}
		}
    	
    	return minStart;
    }
    
    public int findRoute(int[][] grid, int[][] moveCost, int[] prev, int level) {
    	int col = prev[2];
    	if (level == grid.length - 1) return grid[level][col];
    	
    	int[] minChoice = new int[3];
    	
    	int min = Integer.MAX_VALUE;
    	for (int i = 0; i < moveCost[level].length; i++) {
			int length = grid[level][col] + moveCost[grid[level][col]][i];
			if (length < min) {
				min = length;
				int[] temp = {level, col, i}; 
				minChoice = temp;
			}
		}
    	
    	return min + findRoute(grid, moveCost, minChoice, level + 1);
    }
}
