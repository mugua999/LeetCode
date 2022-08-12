package topInterviewQuestions;

import java.util.ArrayList;
import java.util.List;

public class LetterComboOfPhone {
	public static void main(String[] args) {
		LetterComboOfPhone lcp = new LetterComboOfPhone();
		System.out.println(lcp.letterCombinations(""));
	}
	
    public List<String> letterCombinations(String digits) {
        char[][] database = {{},{},{'a','b','c'},{'d','e','f'},{'g','h','i'},{'j','k','l'},
        		{'m','n','o'},{'p','q','r','s'},{'t','u','v'},{'w','x','y','z'}};
        List<String> list = new ArrayList<>();
        char[] choices = new char[digits.length()];
        
        makePick(0,digits,choices,database,list);
        
        return list;
    }
    
    private void makePick(int index, String digits, char[] choices, char[][] database, List<String> list) {
    	if (index == choices.length) {
    		String s = new String(choices);
    		if(!s.isBlank()) list.add(s);
    	} else {
    		int button = digits.charAt(index) - 48;
    		for (int i = 0; i < database[button].length; i++) {
				choices[index] = database[button][i];
				makePick(index + 1, digits, choices, database,list);
			}
    	}
    }
}
