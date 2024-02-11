package contest;

import java.util.Iterator;

public class CountCompleteSubstrings {
	public int countCompleteSubstrings(String word, int k) {
		int count = 0;

		for (int start = 0; start < word.length(); start++) {
			int[] freq = new int[26];

			for (int end = start; end < word.length(); end++) {
				freq[word.charAt(end) - 'a']++;

				if (freq[word.charAt(end) - 'a'] == k) {

					if (isValid(freq, word, k, start, end)) {
						count++;
					}
				}
			}
		}

		return count;
	}

	public boolean isValid(int[] freq, String word, int k, int start, int end) {
		for (int i = 0; i < freq.length; i++) {
			if (freq[i] > 0 && freq[i] != k)
				return false;
		}

		for (int i = start; i < end; i++) {
			if (Math.abs(word.charAt(i) - word.charAt(i + 1)) > 2)
				return false;
		}

		return true;
	}
}
