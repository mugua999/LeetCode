import java.util.LinkedList;
import java.util.Queue;

//BFS search, O(n) = n**2, leetCode unhappy lol
public class Matrix {
	public static void main(String[] args) {
		int[][] matrix = {{0,0,0},{0,1,0},{1,1,1}};
		
		Matrix ma = new Matrix();
		
		int[][] update = ma.updateMatrix(matrix);
		
		for (int i = 0; i < update.length; i++) {
			for (int j = 0; j < update[0].length; j++) {
				System.out.print(update[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public int[][] updateMatrix(int[][] mat) {
		int[][] res = new int[mat.length][mat[0].length];
		boolean[][] visited;
		
		for (int i = 0; i < res.length; i++) {
			for (int j = 0; j < res[0].length; j++) {
				// a 2d array to keep track of every node as if it has been visited by the queue or not
				visited = new boolean[mat.length][mat[0].length]; 
				
				int[] center = { i , j };
				
				//initialize the queue by adding the starting node to queue 
				Queue<int[]> q = new LinkedList<>();
				q.add(center);
				
				//set the starting node as visited
				visited[i][j] = true;
				
				while(!q.isEmpty()) {
					//pop the first node in the queue, record the coordinates in int[] node
					int[] popNode = q.poll();
					
					//check if the node is 0, if it is, record the distance and go the next center node
					//if it is 1, keep looping to add the node's unvisited neighbors
					int rol = popNode[0], col = popNode[1];
					if (mat[rol][col] == 0) {
						res[i][j] = Math.abs(rol - i) + Math.abs(col - j);
						break;
					} else {
						//if the popped node is not 0, keep adding its unvisited surrounding nodes to array 
						if (rol - 1 >= 0 && !visited[rol - 1][col]) {
							int[] node = {rol - 1, col};
							q.add(node);
							visited[rol - 1][col] = true; 
						}
						if (rol + 1 < mat.length && !visited[rol + 1][col]) {
							int[] node = {rol + 1, col};
							q.add(node);
							visited[rol + 1][col] = true;
						}
						if (col - 1 >= 0 && !visited[rol][col - 1]) {
							int[] node = {rol, col - 1};
							q.add(node);
							visited[rol][col - 1] = true;
						}
						if (col + 1 < mat[0].length && !visited[rol][col + 1]) {
							int[] node = {rol, col + 1};
							q.add(node);
							visited[rol][col + 1] = true;
						}
					}
				}
			}
		}
		
		return res;
	}
	
}
