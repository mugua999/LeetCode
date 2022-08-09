package contest;

public class ArithemeticTriplets {
	
    public int arithmeticTriplets(int[] nums, int diff) {
    	int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
			int d = nums[i] + diff, dd = nums[i] + 2 * diff, triple = 1;
			
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[j] == d || nums[j] == dd) {
					triple++;
				}
			}
			if (triple == 3) count++;
		}
        
        return count;
    }
}
