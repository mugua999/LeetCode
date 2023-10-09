package contest;

public class FindtheMinimumPossibleSumofaBeautifulArray {
	public static void main(String[] args) {
		System.out.println(minimumPossibleSum1(13, 50));
	}
	
    public static long minimumPossibleSum(int n, int target) {
        int[] arr = new int[n];
        int max = target / 2;
        int count = 1;
        int sum = 0;
        
        for (int i = 0; i < arr.length; i++) {
			if (count <= max) {
				arr[i] = count++;
			} else {
				arr[i] = target++;
			}
			
			sum += arr[i];
		}
        
        return sum;
    }
    
    public static long minimumPossibleSum1(int n, int target) {
    	long max = (long) Math.floor(target / 2);
    	
    	if(n > max) {
	    	long sum1 = (1+max) * max / 2;
	    	long sum2 = (target + target + (n-max-1)) * (n-max) / 2;
	    	
	    	System.out.println("max = " + max);
	    	System.out.println("sum1 = " + sum1);
	    	System.out.println("sum2 = " + sum2);
	    	
	    	return sum1 + sum2;
    	} else {
    		return (long)(1+n) * n / 2;
    	}
    }
}
