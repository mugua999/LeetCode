
public class Atoi {
	public static void main(String[] args) {
		Atoi at = new Atoi();

		System.out.println(at.myAtoi(""));
	}

	public int myAtoi(String s) {
		s = s.strip();
		
		if (s.isBlank()) return 0;
		
		int res = 0;
		int pointer = 0;
		boolean isNeg = false;

		if (s.charAt(pointer) == '-') {
			isNeg = true;
			pointer++;
		} else if (s.charAt(pointer) == '+') {
			pointer++;
		}

		while (pointer < s.length() && s.charAt(pointer) >= 48 && s.charAt(pointer) <= 57) {
			int num = s.charAt(pointer) - 48;

			if (isNeg) {
				if (res < (Integer.MIN_VALUE + num) / 10) {
					res = Integer.MIN_VALUE;
					break;
				}

				res = res * 10 - num;
			} else {
				if (res > (Integer.MAX_VALUE - num) / 10) {
					res = Integer.MAX_VALUE;
					break;
				}
				
				res = res * 10 + num;
			}

			pointer++;
		}

		return res;
	}
}
