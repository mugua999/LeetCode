package contest;

public class CountSymmetricIntegers {
	public static void main(String[] args) {
		System.out.println(countSymmetricIntegers(1200, 1230));
	}
	
    public static int countSymmetricIntegers(int low, int high) {
    	int count = 0;
    	
        for (int i = low; i < high+1; i++) {
			String s = Integer.toString(i);
			
			if(s.length() % 2 == 0) {
				int sum1 = 0;
				int sum2 = 0;
				
				for (int j = 0; j < s.length() / 2; j++) {
					sum1 += s.charAt(j) - 48;
				}
				
				for (int j = s.length() / 2; j < s.length(); j++) {
					sum2 += s.charAt(j) - 48;
				}
				
				if (sum1 == sum2) count++;
			}
		}
        
        return count;
    }
}
