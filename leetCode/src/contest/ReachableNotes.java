package contest;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ReachableNotes {
	public static void main(String[] args) {
		ReachableNotes rn = new ReachableNotes();
		int n = 7;
		int[][] edges = { {0,1},{1,2},{3,1},{4,0},{0,5},{5,6} };
		int[] restricted = { 4,5 };

		System.out.println(rn.reachableNodes(n, edges, restricted));

	}

	public int reachableNodes(int n, int[][] edges, int[] restricted) {
		int count = 1;
		boolean[] visited = new boolean[n];
		Queue<Integer> q = new LinkedList<>();
		q.add(0);
		visited[0] = true;

		// only add links that connect non-restricted nodes to link lists
		List<int[]> list = new ArrayList<>();
		for (int i = 0; i < edges.length; i++) {
			if (!isRestricted(edges[i][0], restricted) && !isRestricted(edges[i][1], restricted)) {
				int[] edge = { edges[i][0], edges[i][1] };
				list.add(edge);
			}
		}

		while (!q.isEmpty()) {
			System.out.println("queue: " + q );
			for (int i = 0; i < list.size(); i++) {
				System.out.print("[" + list.get(i)[0] + " " + list.get(i)[1] + "]");
			}
			System.out.println();
			int node = q.poll();
			
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i)[0] == node || list.get(i)[1] == node) {
					if (list.get(i)[0] == node) {
						q.add(list.get(i)[1]);
					}
					if (list.get(i)[1] == node) {
						q.add(list.get(i)[0]);
					}
					
					list.remove(i);
					i--;
					count++;
				}
			}
		}

		return count;
	}

	private boolean isRestricted(int n, int[] restricted) {
		for (int i = 0; i < restricted.length; i++) {
			if (restricted[i] == n)
				return true;
		}

		return false;
	}
}
