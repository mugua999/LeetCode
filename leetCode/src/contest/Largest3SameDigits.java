package contest;

public class Largest3SameDigits {

	public static void main(String[] args) {
		String num = "2300019";
		System.out.println(largestGoodInteger(num));
	}

	public static String largestGoodInteger(String num) {
		int left = 0;
		int right = left + 3;
		int largest = -1;
		String largestStr = "";
		
		while (right <= num.length()) {
			String window = num.substring(left, right);
			int windowNum = -2;
			if (window.charAt(0) == window.charAt(1) && window.charAt(1) == window.charAt(2)) {
				windowNum = Integer.parseInt(window);
			}
			
			if (windowNum > largest) {
				largest = windowNum;
				largestStr = window;
			}
			
			left++;
			right++;
		}
		
		
		return (largest == -1) ? "" : largestStr;
	}

}
