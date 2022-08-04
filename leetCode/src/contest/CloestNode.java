package contest;

import java.util.HashSet;
import java.util.Set;

public class CloestNode {
	public static void main(String[] args) {
		CloestNode cn = new CloestNode();
		int[] edges = {9,8,7,0,5,6,1,3,2,2};
		int node1 = 1, node2 = 6;
		
		System.out.println(cn.closestMeetingNode(edges, node1, node2));
	}
	
    public int closestMeetingNode(int[] edges, int node1, int node2) {
        int min = Integer.MAX_VALUE / 2, minNode = -1;
        
        for (int i = 0; i < edges.length; i++) {
			int length1 = findLength(edges, node1, i);
			int length2 = findLength(edges, node2, i);
			
			if (Math.max(length1, length2) < min) {
				min = Math.max(length1, length2);
				minNode = i;
			}
		}
        
        return minNode;
    }
    
    private int findLength(int[] edge, int start, int target) {
    	int length = 0;
    	Set<Integer> set = new HashSet<>();
    	
    	while (start != target) {
    		if(set.contains(start) || edge[start] == -1) return Integer.MAX_VALUE / 2;
    		
    		set.add(start);
    		length++;
    		start = edge[start];
    	}
    	
    	return length;
    }
}
