package contest;

public class FindChampionI {
	public static void main(String[] args) {
		int[][] grid = {{0,0,1},{1,0,1},{0,0,0}};
		
		System.out.println(findChampion(grid));
	}
	
    public static int findChampion(int[][] grid) {
        int strongest = 0;
        
        for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				if(grid[i][j] == 1 && j == strongest) {
					strongest = i;
				} else if (grid[i][j] != 1 && i == strongest) {
					strongest = j;
				}
			}
		}
        
        return strongest;
    }
}
