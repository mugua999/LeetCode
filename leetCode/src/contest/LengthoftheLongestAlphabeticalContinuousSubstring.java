package contest;

public class LengthoftheLongestAlphabeticalContinuousSubstring {
	public static void main(String[] args) {
		LengthoftheLongestAlphabeticalContinuousSubstring ll = new LengthoftheLongestAlphabeticalContinuousSubstring();
		
		System.out.println(ll.longestContinuousSubstring("abacaba"));
	}
	
    public int longestContinuousSubstring(String s) {
    	if (s.length() == 0) return 0;
    	if (s.length() == 1) return 1;
    	
        int left = 0 , right = 1, max = 0;
        
        while(right < s.length()) {
        	if (s.charAt(right) - s.charAt(right - 1) != 1) {
        		int length = right - left;
        		max = (max > length) ? max : length;
        		left = right;
        	} else if (right == s.length() - 1) {
        		int length = right - left + 1;
        		max = (max > length) ? max : length;
        	}
        	
        	right++;
        }
        
        return max;
    }
}
