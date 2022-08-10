package algoCourse;

public class ClimbingStairs {
	public static void main(String[] args) {
		ClimbingStairs cs = new ClimbingStairs();
		
		System.out.println(cs.climbStairs(45));
	}
	
    public int climbStairs(int n) {
    	int[] record = new int[n + 1];
    	return climb(n, record);
    }
    
    private int climb(int n, int[] record) {
        if (n == 0) return 1;
        if (n == -1) return 0;
        
    	if (record[n] == 0) {
    		record[n] = climb(n - 1, record) + climb(n-2, record);
    	}
    	
        return record[n];
    }
}
