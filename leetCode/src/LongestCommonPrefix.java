
public class LongestCommonPrefix {
	public static void main(String[] args) {
		LongestCommonPrefix lc = new LongestCommonPrefix();
		String[] strs = { "ab", "a" };
		
		System.out.println(lc.longestCommonPrefix(strs));
	}
	
    public String longestCommonPrefix(String[] strs) {
    	if (strs.length == 0) return "";
    	
    	int pointer = 0;
    	StringBuilder sb = new StringBuilder();
    	
    	outer:
    	while(pointer < strs[0].length()) {
    		char c = strs[0].charAt(pointer);
    		
    		for (int i = 0; i < strs.length; i++) {
				if(pointer >= strs[i].length() || strs[i].charAt(pointer) != c) {
					break outer;
				}
			}
    		
    		sb.append(c);
    		pointer++;
    	}
    	
    	return sb.toString();
    }
}
