import java.util.ArrayList;
import java.util.List;

public class Matrix {
	public static void main(String[] args) {
		int[][] mat = {{0,0,0},{0,1,0},{1,1,1}};
		int[][] ans = updateMatrix(mat);
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				System.out.print(ans[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static int[][] updateMatrix(int[][] mat) {
		List<int[]> list0 = new ArrayList<>();
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				int[] index = {i,j};
				if(mat[i][j] == 0) list0.add(index);
			}
		}
		
		for (int[] is : list0) {
			System.out.print(is[0] + " " + is[1] + " | ");
		}
		System.out.println();
		
		int[][] ans = new int[mat.length][mat[0].length];
		
		for (int i = 0; i < ans.length; i++) {
			for (int j = 0; j < ans[0].length; j++) {
				if (mat[i][j] != 0) {
					int min = Integer.MAX_VALUE;
					for (int[] index : list0) {
						int dist = Math.abs(index[0] - i) + Math.abs(index[1] - j);
						min = (dist < min) ? dist : min;
					}
					ans[i][j] = min;
				}
			}
		}
		
		return ans;
	}
}
