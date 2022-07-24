import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {
	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("pwwkew"));
	}

	public static int lengthOfLongestSubstring(String s) {
		int[] arr = new int[128];
		int longest = 0, left = 0, right = 0;

		while (right < s.length()) {
			char r = s.charAt(right);
			arr[r]++;
			
			while (arr[r] > 1) {
				longest = (right - left > longest) ? right - left : longest;
				char l = s.charAt(left);
				arr[l]--;
				left++;
			}
			
			if (right == s.length() - 1) {
				longest = (right - left + 1> longest) ? right - left + 1: longest;
			}

			right++;
		}

		return (longest == 0) ? s.length() : longest;
	}
}
