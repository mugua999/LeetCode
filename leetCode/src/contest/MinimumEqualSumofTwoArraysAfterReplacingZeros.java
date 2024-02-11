package contest;

public class MinimumEqualSumofTwoArraysAfterReplacingZeros {
    public long minSum(int[] nums1, int[] nums2) {
        int sum1 = 0, sum2 = 0; 
        int zeroCount1 = 0, zeroCount2 = 0;
        
        for (int i = 0; i < nums1.length; i++) {
        	if (nums1[i] == 0) {
        		zeroCount1++;
        	}
        	
			sum1 += nums1[i];
		}
        
        for (int i = 0; i < nums2.length; i++) {
        	if (nums2[i] == 0) {
        		zeroCount2++;
        	}
        	
			sum2 += nums2[i];
		}
        
        return 1;
        
    }
}
