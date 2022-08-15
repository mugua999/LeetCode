package contest;

public class NodewithHighestScore {
	public static void main(String[] args) {
		int[] edges = {2,0,0,2};
		
		NodewithHighestScore nhs = new NodewithHighestScore();
		
		System.out.println(nhs.edgeScore(edges));
	}
	
    public int edgeScore(int[] edges) {
        int[] scores = new int[edges.length];
        
        for (int i = 0; i < edges.length; i++) {
        	if(scores[edges[i]] < Integer.MAX_VALUE / 2 - 1) scores[edges[i]] += i;
		}
        
        int max = 0, maxIndex = 0;
        
        for (int i = 0; i < scores.length; i++) {
			if(scores[i] > max) {
				max = scores[i];
				maxIndex = i; 
			}
		}
        
        return maxIndex;
    }
}
