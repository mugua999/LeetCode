package contest;

public class NumberofFairPairs {
    public long countFairPairs(int[] nums, int lower, int upper) {
        int res = 0;
        
        for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				int sum = nums[i] + nums[j];
				
				if (sum >= lower && sum <= upper) res++;
			}
		}
        
        return res;
    }
}
