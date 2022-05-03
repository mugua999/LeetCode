import java.util.StringTokenizer;

public class ReverseWordInAString {

	public static void main(String[] args) {
		String s = "Let's take the leetcode contest";
		System.out.println(reverseWords(s));
	}

	public static String reverseWords(String s) {
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(s, " ");
		
		while(st.hasMoreTokens()) {
			sb.append(new StringBuffer(st.nextToken()).reverse().toString() + " ");
		}
		
		return sb.toString().trim();
	}

}
