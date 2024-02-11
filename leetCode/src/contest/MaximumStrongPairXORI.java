package contest;

public class MaximumStrongPairXORI {
    public int maximumStrongPairXor(int[] nums) {
        int strongest = -1;
        
        for (int i = 0; i < nums.length; i++) {
			for (int j = i; j < nums.length; j++) {
				if (Math.abs(nums[i] - nums[j]) <= Math.min(nums[i], nums[j])) {
					int xor = nums[i] ^ nums[j];
					
					strongest = (xor > strongest) ? xor : strongest;
				}
			}
		}
        
        return strongest;
    }
}
