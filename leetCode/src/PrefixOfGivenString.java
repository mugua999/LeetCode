
public class PrefixOfGivenString {
	public static void main(String[] args) {
		String s = "abc";
		String[] words = {"a","b","c","ab","bc","abc"};
		System.out.println(countPrefixes(words, s));
	}

	public static int countPrefixes(String[] words, String s) {
		int count = 0;
		for (int i = 0; i < words.length; i++) {
			if (s.startsWith(words[i])) count++;
		}
		
		return count;
	}
}
