
public class UpdatedMatrix {
	int[][] mat;
	int[][] ans;
	
	public int[][] updateMatrix(int[][] mat) {
		this.mat = mat;
		ans = new int[mat.length][mat[0].length];
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				ans[i][j] = distance(i,j);
			}
		}
		
		return ans;
	}
	
	public int distance(int r, int c) {
		if (r < 0 || r >= mat.length || c < 0 || c >= mat[0].length) return 1;
		if (mat[r][c] == 0) return 0;
		return (1 + (distance(r-1,c) + distance(r+1,c) + distance(r,c-1) + distance(r,c+1)) / 4);
	}
}
