package contest;

public class FindMissingandRepeatedValues {
	public static void main(String[] args) {
		int[][] grid = {{9,1,7},{8,9,2},{3,4,6}};
		int[] res = findMissingAndRepeatedValues(grid);
		
		for (int i : res) {
			System.out.print(i + " ");
		}
		
	}
	
    public static int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] count = new int[grid.length * grid.length + 1];
        int[] res = new int[2];
        
        for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				count[grid[i][j]]++;
			}
		}
        
        for (int i = 0; i < count.length; i++) {
			if(count[i] == 0) res[1] = i;
			if(count[i] == 2) res[0] = i;
		}
        
        return res;
    }
}
