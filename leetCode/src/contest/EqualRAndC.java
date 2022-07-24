package contest;

public class EqualRAndC {
	public static void main(String[] args) {
		int[][] arr = {{3,1,2,2},{1,4,4,5},{2,4,2,2},{2,4,2,2}};
		EqualRAndC eq = new EqualRAndC();
		
		System.out.println(eq.equalPairs(arr));
	}
	
    public int equalPairs(int[][] grid) {
    	int count = 0, pointer = 0;
    	
        for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				while (pointer < grid.length) {
					if(grid[i][pointer] == grid[pointer][j]) {
						if (pointer == grid.length - 1) count++;
						pointer++;
					}
					else break;
				}
				pointer = 0;
			}
		}
        
        return count;
    }
    
}
