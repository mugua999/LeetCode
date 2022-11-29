package contest;

public class AppendCharactersToStringtoMakeSubsequence {
	public static void main(String[] args) {
		String s = "abcde";
		String t = "a";
		AppendCharactersToStringtoMakeSubsequence ac = new AppendCharactersToStringtoMakeSubsequence();
		
		System.out.println(ac.appendCharacters(s, t));
	}
	
    public int appendCharacters(String s, String t) {
        int sPointer = 0, tPointer = 0;
        int ans = 0;
        
        while (sPointer < s.length()) {
        	if (tPointer == t.length()) return 0;
        	
        	if (s.charAt(sPointer) == t.charAt(tPointer)) {
        		tPointer++;
        	} 
        	
        	sPointer++;
        }
        
        ans = t.length() - tPointer;
        
        return ans;
    }
}
