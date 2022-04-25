
public class LongestSubstring {
	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("aab"));
	}

	public static int lengthOfLongestSubstring(String s) {
		char[] arr = s.toCharArray();
		int longest = 0;
		
		search:
		for (int i = 0; i < arr.length - 1; i++) {
			//jSearch: 
			for (int j = i + 1; j < arr.length; j++) {
				for (int x = i; x < j; x++) {
					if (arr[x] == arr[j]) {
						if (j - i > longest) {
							longest = j - i;
							System.out.println("i= " + i + " j= " + j + " x= " + x);
						}
						//break jSearch;
						continue search;
					}
				}
				if ((j < arr.length - 1 && arr[j] == arr[j + 1]) || j == arr.length - 1) {
					if (j - i + 1 > longest) {
						longest = j - i + 1;
						System.out.println("i= " + i + " j= " + j);
					}
					//break jSearch;
					continue search;
				}
			}
		}

		if (longest != 0) {
			return longest;
		} else
			return s.length();
	}
}
