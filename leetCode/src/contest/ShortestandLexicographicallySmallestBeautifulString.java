package contest;

import java.util.ArrayList;
import java.util.List;

public class ShortestandLexicographicallySmallestBeautifulString {
    public String shortestBeautifulSubstring(String s, int k) {
    	String ans = "z";
    	int shortestLen = 101; 
        for (int i = 0; i < s.length(); i++) {
			int count = 0;
			
			for (int j = i; j < s.length(); j++) {
				if (s.charAt(j) == '1') {
					count++;
					
					if (count == k) {
						if (j - i + 1 < shortestLen) {
							shortestLen = j - i + 1;
							ans = s.substring(i, j+1);
						} else if (j - i + 1 == shortestLen){
							if (s.substring(i, j+1).compareTo(ans) < 0) 
								ans = s.substring(i, j+1);
						}
					}
				}
			}
		}
        
        if (ans.equalsIgnoreCase("z")) {
        	return "";
        } else return ans;
    }
}
