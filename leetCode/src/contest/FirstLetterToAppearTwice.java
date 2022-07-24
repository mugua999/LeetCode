package contest;

public class FirstLetterToAppearTwice {
	public static void main(String[] args) {
		String s = "abcd";
		FirstLetterToAppearTwice fl = new FirstLetterToAppearTwice();
		
		System.out.println(fl.repeatedCharacter(s));
	}
	
    public char repeatedCharacter(String s) {
        char[] arr = s.toCharArray();
        int[] count = new int[26];
        
        for (int i = 0; i < arr.length; i++) {
			if (count[arr[i] - 97] > 0) return arr[i];
			else count[arr[i] - 97]++;
		}
        
        return 0;
    }
}
