package contest;

public class ThePivotInteger {
    public int pivotInteger(int n) {
    	int ans = -1;
    	
        for (int i = 1; i <= n; i++) {
			int sum1 = (1 + i) * i / 2;
			int sum2 = (i + n) * (n - i + 1) / 2;
			
			if (sum1 == sum2) ans = i;
		}
        
        return ans;
    }
}
