package contest;

public class MakeThreeStringsEqual {
    public int findMinimumOperations(String s1, String s2, String s3) {
        int minLength = Math.min(s1.length(), Math.min(s2.length(), s3.length()));
        int sameLength = 0;
        
        for (int i = 0; i < minLength; i++) {
			if (s1.charAt(i) == s2.charAt(i) && s2.charAt(i) == s3.charAt(i)) {
				sameLength++;
			} else {
				break;
			}
		}
        
        int operation = s1.length() - sameLength + s2.length() - sameLength + s3.length() - sameLength;;
        
        if (sameLength != 0) {
        	return operation;
        } else return -1;
    }
}
