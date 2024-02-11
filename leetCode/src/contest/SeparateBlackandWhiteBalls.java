package contest;

public class SeparateBlackandWhiteBalls {
    public long minimumSteps(String s) {

        long indexOfZero = 0, swaps = 0;
        
        for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '0') {
				swaps += i - indexOfZero;
				indexOfZero++;
			}
		}
        
        return swaps;
    }
}
