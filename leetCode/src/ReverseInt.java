
public class ReverseInt {
	public static void main(String[] args) {
		int n = 0;
		System.out.println(reverse(n));
	}

	public static int reverse(int x) {

		String s = Integer.toString(x);
		int length = s.length();
		int[] arr;
		
		if (x >= 0) {
			arr = new int[length];
			
			for (int i = 0; i < length; i++) {
				arr[i] = Integer.parseInt(s.substring(length - 1 - i, length - i));
			}
		}else {
			arr = new int[length - 1];
			
			for (int i = 0; i < length - 1; i++) {
				arr[i] = Integer.parseInt(s.substring(length - 1 - i, length - i));
			}
		}

		long result = 0;

		for (int i = 0; i < arr.length; i++) {
			result += arr[i] * Math.pow(10, arr.length - 1 - i);
			if (result > Integer.MAX_VALUE)
				return 0;
		}

		if (x < 0) result *= -1;

		return (int) result;
	}
}
