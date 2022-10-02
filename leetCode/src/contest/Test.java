package contest;

import java.util.Arrays;
import java.util.TreeSet;

public class Test {
	public static void main(String[] args) {
		String str = Integer.toBinaryString(24);
		String str2 = Integer.toBinaryString(25);
		
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == '1') count++;
		}
		
		System.out.println(str);
		System.out.println(str2);
		System.out.println(24 ^ 25);
	}
}
