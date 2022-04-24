

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RansomNote {
	public static void main(String[] args) {
		System.out.println(canConstruct("aa","ab"));
	}

	public static boolean canConstruct(String ransomNote, String magazine) {
		if (ransomNote.length() == 0) return true;
		
		for(int i = 0; i < magazine.length(); i++) {
			StringBuilder sb = new StringBuilder(magazine);
			char c = magazine.charAt(i);
			
			if (ransomNote.charAt(0) == c) {
				sb.deleteCharAt(i);
				String newRansom = ransomNote.substring(1);
				if (canConstruct(newRansom,sb.toString())) {
					return true;
				}
			}
		}
		
		return false;
	}
	
}
