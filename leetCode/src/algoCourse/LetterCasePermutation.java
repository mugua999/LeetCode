package algoCourse;

import java.util.ArrayList;
import java.util.List;

public class LetterCasePermutation {
	public static void main(String[] args) {
		LetterCasePermutation lcp = new LetterCasePermutation();
		System.out.println(lcp.letterCasePermutation("3z4"));
	}
	
    public List<String> letterCasePermutation(String s) {
        char[] ch = s.toCharArray();
        List<Integer> charIndex = new ArrayList<>();
        List<List<Integer>> list = new ArrayList<>();
        List<String> res = new ArrayList<>();
        
        for (int i = 0; i < ch.length; i++) {
			if (ch[i] > 64) charIndex.add(i);
		}
        
        for (int i = 0; i <= charIndex.size(); i++) {
			int[] choices = new int[i];
			
			makePick(0,charIndex,choices,list);
		}
        
        for (List<Integer> lis : list) {
        	char[] tempCh = ch.clone(); 
			for (Integer i : lis) {
				if (tempCh[i] < 91) {
					tempCh[i] += 32;
				} else {
					tempCh[i] -= 32;
				}
			}
			String st = new String(tempCh);
			res.add(st);
		}
        
        return res;
    }
    
    private void makePick(int index, List<Integer> database, int[] choices, List<List<Integer>> list) {
    	if (index == choices.length) {
    		List<Integer> temp = new ArrayList<>();
    		for (int i = 0; i < choices.length; i++) {
				temp.add(database.get(choices[i]));
			}
    		list.add(temp);
    	} else {
    		int start = 0;
    		if (index != 0) start = choices[index - 1] + 1;
    		for (int i = start; i < database.size(); i++) {
				choices[index] = i;
				makePick(index + 1, database, choices, list);
			}
    	}
    }
}
