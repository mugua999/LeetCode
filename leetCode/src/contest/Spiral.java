package contest;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Spiral {
	public static void main(String[] args) {
		Integer[] array = {8,24,5,21,10,11,11,12,6,17};
		List<Integer> list = new LinkedList<>(Arrays.asList(array));
		
		ListNode ln = new ListNode(list);
		
		Spiral s = new Spiral();
		
		int[][] ans = s.spiralMatrix(10, 1, ln);
		
		for (int i = 0; i < ans.length; i++) {
			for (int j = 0; j < ans[0].length; j++) {
				System.out.print(ans[i][j] + " ");
			}
			System.out.println();
		}
	
	}
	
	public int[][] spiralMatrix(int m, int n, ListNode head) {
		int[][] matrix = new int[m][n];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				matrix[i][j] = -1;
			}
		}

		int r = 0, c = 0;
		while (head != null) {
			
			while (c + 1 < n && matrix[r][c + 1] == -1 && head != null) {
				matrix[r][c] = head.val;
				c++;
				head = head.next;
			} 
			
			while (r + 1 < m && matrix[r + 1][c] == -1 && head != null) {
				matrix[r][c] = head.val;
				r++;
				head = head.next;
			} 
			
			while (c > 0 && matrix[r][c - 1] == -1 && head != null) {
				matrix[r][c] = head.val;
				c--;
				head = head.next;
			} 
			
			while (r > 0 && matrix[r - 1][c] == -1 && head != null) {
				matrix[r][c] = head.val;
				r--;
				head = head.next;
			}
			
		}
		
		return matrix;
	}
}
