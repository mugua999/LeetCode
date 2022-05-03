import java.util.Arrays;

public class PremutationInString {
	public static void main(String[] args) {
		String s1 = "ab";
		String s2 = "a";
		System.out.println(checkInclusion(s1, s2));
	}

	public static boolean checkInclusion(String s1, String s2) {
		if (s1.length() > s2.length()) return false;
		int[] arr1 = new int[128];
		int[] arr2 = new int[128];
		int left = 0, right = left + s1.length() - 1;

		for (int i = 0; i < s1.length(); i++) {
			char c1 = s1.charAt(i);
			arr1[c1]++;
		}

		for (int i = left; i <= right; i++) {
			char c2 = s2.charAt(i);
			arr2[c2]++;
		}
		if (Arrays.equals(arr1, arr2)) return true;
		
		while (right < s2.length() - 1) {
			char c2 = s2.charAt(left);
			arr2[c2]--;
			left++;

			right++;
			char c3 = s2.charAt(right);
			arr2[c3]++;
			System.out.println("index " + left + " to " + right + " tested");
			if (Arrays.equals(arr1, arr2)) return true;
		}

		return false;
	}
}
