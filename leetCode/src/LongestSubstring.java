import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {
	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("pwwkew"));
	}

	public static int lengthOfLongestSubstring(String s) {
		char[] arr = s.toCharArray();
		int longest = 0;

		for (int i = 0; i < arr.length; i++) {
			Set<Character> set = new HashSet<>();
			for (int j = i; j < arr.length; j++) {
				if (set.contains(arr[j])) {
					longest = Math.max(longest, set.size());
					break;
				}else {
					set.add(arr[j]);
					longest = Math.max(longest, set.size());
				}	
			}
		}

		return longest;
	}
}
