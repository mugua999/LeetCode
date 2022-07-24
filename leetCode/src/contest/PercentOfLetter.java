package contest;

public class PercentOfLetter {
	public static void main(String[] args) {
		String s = "jjjj";
		char letter = 'k';
		System.out.println(percentageLetter(s, letter));
	}
	
	public static int percentageLetter(String s, char letter) {
		double count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == letter) count++;
		}
		
		return (int)((count / s.length()) * 100);
	}
}
