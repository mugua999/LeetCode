package algoCourse;

import java.util.ArrayList;
import java.util.List;

public class Combinations {
	public static void main(String[] args) {
		Combinations c = new Combinations();
		
		System.out.println(c.combine(4,2));
	}
	
    public List<List<Integer>> combine(int n, int k) {
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
        	arr[i] = i + 1;
        }
        
        List<List<Integer>> list = new ArrayList<>();
        
        int[] choice = new int[k];
        
        makePick(0,arr,choice,list);
        
        return list;
    }
    
    private void makePick(int index, int[] database, int[] choices, List<List<Integer>> list) {
    	if (index == choices.length) {
    		List<Integer> temp = new ArrayList<>();
    		for (int i = 0; i < choices.length; i++) {
				temp.add(database[choices[i]]);
			}
    		list.add(temp);
    	} else {
    		int start = 0;
    		if (index != 0) start = choices[index - 1] + 1;
    		for (int i = start; i < database.length; i++) {
				choices[index] = i;
				makePick(index + 1, database, choices, list);
			}
    	}
    }
}
