package algoCourse;

import java.util.List;

public class Triangle {
    public int minimumTotal(List<List<Integer>> triangle) {
        int[] dp = new int[triangle.size() + 1];
        
        dp[0] = 0;
        dp[1] = triangle.get(0).get(0);
        
        for (int i = 1; i < triangle.size(); i++) {
			dp[i+1] = Math.min(dp[i] + triangle.get(i).get(i), dp[i] + triangle.get(i).get(i+1));
		}
        
        return dp[triangle.size()];
    }
}
