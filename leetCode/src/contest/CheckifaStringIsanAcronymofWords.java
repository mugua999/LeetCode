package contest;

import java.util.List;

public class CheckifaStringIsanAcronymofWords {
	public static void main(String[] args) {
		
	}
	
    public boolean isAcronym(List<String> words, String s) {
    	String acro = "";
    	
        for (int i = 0; i < words.size(); i++) {
			acro += words.get(i).charAt(0);
		}
        
        return acro.equals(s);
    }
}
