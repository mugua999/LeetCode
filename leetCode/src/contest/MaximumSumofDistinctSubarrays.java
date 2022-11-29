package contest;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MaximumSumofDistinctSubarrays {
	
    public long maximumSubarraySum(int[] nums, int k) {
    	
    	long max = 0;
    	
        for (int i = 0; i <= nums.length - k; i++) {
        	
        	long sum = 0;
			
			Set<Integer> set = new HashSet<>(IntStream.of(Arrays.copyOfRange(nums, i, i+k)).boxed().collect(Collectors.toList()));
			
			if (set.size() == k) {
				sum = set.stream().mapToInt(Integer::intValue).sum();
			}
			
			max = (sum > max) ? sum : max;
		}
        
        return max;
    }
}
