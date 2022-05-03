
public class ReverseString {
	public static void main(String[] args) {
		char[] s = {'H', 'E', 'L', 'L', 'O'};
		reverseString(s);
		System.out.println(s);
	}

	public static void reverseString(char[] s) {
		int left = 0, right = s.length - 1;
		do {
			char temp = s[right];
			s[right] = s[left];
			s[left] = temp;
			left++;
			right--;
		}while (left < right);
	}
}
