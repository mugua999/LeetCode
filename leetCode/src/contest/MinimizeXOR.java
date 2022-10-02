package contest;

public class MinimizeXOR {
	public static void main(String[] args) {
		MinimizeXOR min = new MinimizeXOR();
		
		System.out.println(min.minimizeXor(25,72));
	}
	
    public int minimizeXor(int num1, int num2) {
    	String str1 = Integer.toBinaryString(num1);
        String str2 = Integer.toBinaryString(num2);
        
		int count2 = 0;
		for (int i = 0; i < str2.length(); i++) {
			if(str2.charAt(i) == '1') count2++;
		}
		
		System.out.println("count2 = " + count2);
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < str1.length(); i++) {
			sb.append(str1.charAt(i));
			
			if (str1.charAt(i) == '1') count2--;
			
			if (count2 == 0) {
				while(sb.length() < str1.length()) {
					sb.append('0');
				}
				return Integer.parseInt(sb.toString(), 2);
			}
		}
		
		System.out.println("finish with 1st try");
		
		for(int i = sb.length() - 1; i >= 0; i--) {
			if(sb.charAt(i) == '0') {
				sb.replace(i, i+1, "1");
				count2--;
				if (count2 == 0) return Integer.parseInt(sb.toString(), 2);
			}
		}
		
		System.out.println("finish with 2nd try");
		
		while(count2 > 0) {
			sb.insert(0,'1');
			count2--;
		}
		
		return Integer.parseInt(sb.toString(), 2);
    }
    
}
