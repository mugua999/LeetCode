package contest;

public class MaxPairSuminanArray {
	public static void main(String[] args) {
		int[] nums = {31,25,72,79,74};
		
		System.out.println(maxSum(nums));
	}
	
    public static int maxSum(int[] nums) {
    	int max = -1;
    	
        for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i+1; j < nums.length; j++) {
				if(findMaxDigit(nums[i]) == findMaxDigit(nums[j])) {
					int sum = nums[i] + nums[j];
					
					max = (sum > max) ? sum : max;
				}
			}
		}
        
        return max;
    }
    
    public static int findMaxDigit(int num) {
    	int maxDigit = 0;
    	
    	while (num > 0) {
    		int currentDigit = num%10;
    		
    		maxDigit = (currentDigit > maxDigit) ? currentDigit : maxDigit;
    		
    		num /=10;
    	}
    	
    	return maxDigit;
    }
}
