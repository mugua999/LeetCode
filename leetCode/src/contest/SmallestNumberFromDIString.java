package contest;

public class SmallestNumberFromDIString {
	public static void main(String[] args) {
		SmallestNumberFromDIString snf = new SmallestNumberFromDIString();
		System.out.println(snf.smallestNumber("DDD"));
	}
	
    public String smallestNumber(String pattern) {
        int[] ans = new int[pattern.length() + 1];
        ans[0] = 1;
        int Dcount = 0;
        
        for (int i = 0; i < pattern.length(); i++) {
        	int max = 0;
			for (int j = 0; j < ans.length; j++) {
				if (ans[j] > max) max = ans[j];
			}
			
			if (pattern.charAt(i) == 'I') {
				ans[i + 1] = max + 1;
				Dcount = 0;
			} else {
				for (int j = 0; j <= Dcount; j++) {
					ans[i - j]++;
				}
				ans[i + 1] = ans[i] - 1;
				Dcount++;
			}
		}
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < ans.length; i++) {
			sb.append(ans[i]);
		}
        
        return sb.toString();
    }
}
