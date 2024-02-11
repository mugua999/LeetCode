package contest;

import java.util.Arrays;
import java.util.Collection;

public class CheckifBitwiseORHasTrailingZeros {
    public boolean hasTrailingZeros(int[] nums) {
        /**int count = 0;
        
        for (int i : nums) {
			String bin = Integer.toBinaryString(i);
			
			if(bin.charAt(bin.length() - 1) == '0') count++;
			
			if (count == 2) return true;
		}
        
        return false;**/
        
        return Arrays.stream(nums).mapToObj(i -> Integer.toBinaryString(i)).filter(bin -> bin.endsWith("0")).limit(2).count() >=2;
    }
}
