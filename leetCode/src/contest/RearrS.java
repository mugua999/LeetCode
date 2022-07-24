package contest;

/**
 * You are given two 0-indexed strings s and target. You can take some letters
 * from s and rearrange them to form new strings.
 * 
 * Return the maximum number of copies of target that can be formed by taking
 * letters from s and rearranging them.
 *
 */

public class RearrS {

	public static void main(String[] args) {
		String s = "abbaccaddaeea";
		String target = "aaaaa";
		System.out.println(rearrangeCharacters(s, target));
	}

	public static int rearrangeCharacters(String s, String target) {
		int[] tar = new int[target.length()];
		int[] same = new int[target.length()];
		
		for (int i = 0; i < target.length(); i++) {
			for (int j = 0; j < s.length(); j++) {
				if (target.charAt(i) == s.charAt(j)) tar[i]++;
			}
		}
		
		for (int i = 0; i < same.length; i++) {
			int count = 0;
			for (int j = 0; j < same.length; j++) {
				if (target.charAt(i) == target.charAt(j)) count++;
			}
			same[i] = count;
		}
		
		for (int i = 0; i < tar.length; i++) {
			if (same[i] > 0) tar[i] /= same[i];
		}
		
		for (int i = 0; i < tar.length; i++) {
			System.out.print(tar[i] + " ");
		}
		System.out.println();
		
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < tar.length; i++) {
			min = (tar[i] < min) ? tar[i] : min;
		}

		return min;
	}

}
