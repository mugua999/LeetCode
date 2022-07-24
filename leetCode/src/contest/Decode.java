package contest;

import java.util.LinkedHashSet;
import java.util.Set;

public class Decode {
	public static void main(String[] args) {
		Decode dc = new Decode();
		String key = "the quick brown fox jumps over the lazy dog";
		String message = "vkbs bs t suepuv";
		
		//System.out.println((char)97);
		String ans = dc.decodeMessage(key, message);
		System.out.println(ans);
	}
	
	public String decodeMessage(String key, String message) {
		key = key.replaceAll("\\s+", "");
		char[] messageCode = message.toCharArray();
		char[] ans = new char[messageCode.length];
		
		String newKey = new String();
		
		for (int i = 0; i < key.length(); i++) {
			if (newKey.indexOf(key.charAt(i)) == -1) {
				newKey += key.charAt(i);
			}
		}
		
		char[] keyCode = newKey.toCharArray();
		
		for (int i = 0; i < messageCode.length; i++) {
			if (messageCode[i] == ' ') ans[i] = ' ';
			for (int j = 0; j < keyCode.length; j++) {
				if (messageCode[i] == keyCode[j]) {
					ans[i] = (char)(j+97);
				}
			}
		}
		
		return new String(ans);
	}
}
