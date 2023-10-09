package contest;

public class DeterminetheMinimumSumofakavoidingArray {
	public static void main(String[] args) {
		System.out.println(minimumSum(3, 6));
	}
	
    public static int minimumSum(int n, int k) {
        int[] arr = new int[n];
        int count = 1;
        
        int max = k/2;
        
        System.out.println("max = " + max);
        
        for (int i = 0; i < arr.length; i++) {
			if(count <= max || max >= k) {
				arr[i] = count;
				count++;
			} else {
				arr[i] = k;
				k++;
			}
		}
        
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
        	System.out.print(arr[i] + " ");
			sum += arr[i];
		}
        
        return sum;
    }
}
