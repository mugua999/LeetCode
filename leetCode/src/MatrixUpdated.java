import java.util.LinkedList;
import java.util.Queue;

public class MatrixUpdated {
	public static void main(String[] args) {
		int[][] matrix = {{0,0,0},{0,1,0},{0,0,0}};
		
		MatrixUpdated ma = new MatrixUpdated();
		
		int[][] update = ma.updateMatrix(matrix);
		
		for (int i = 0; i < update.length; i++) {
			for (int j = 0; j < update[0].length; j++) {
				System.out.print(update[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public int[][] updateMatrix(int[][] mat) {
		Queue<int[]> q = new LinkedList<>();
		
		//set all the cell with 1's distance to max
		//add all 0 cell to queue
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				if(mat[i][j] == 1) mat[i][j] = Integer.MAX_VALUE;
				else {
					int[] node = {i,j};
					q.add(node);
				}
			}
		}
		
		while(!q.isEmpty()) {
			int[] node = q.poll();
			int rol = node[0], col = node[1], dis = mat[rol][col];
			
			if (rol - 1 >= 0 && mat[rol - 1][col] > dis) {
				mat[rol - 1][col] = dis + 1;
				int[] index = {rol - 1, col};
				q.add(index);
			}
			if (rol + 1 < mat.length && mat[rol + 1][col] > dis) {
				mat[rol + 1][col] = dis + 1;
				int[] index = {rol + 1, col};
				q.add(index);
			}
			if (col - 1 >= 0 && mat[rol][col - 1] > dis) {
				mat[rol][col - 1] = dis + 1;
				int[] index = {rol, col - 1};
				q.add(index);
			}
			if (col + 1 < mat[0].length && mat[rol][col + 1] > dis) {
				mat[rol][col + 1] = dis + 1;
				int[] index = {rol, col + 1};
				q.add(index);
			}
		}
		
		return mat;
	}
}
