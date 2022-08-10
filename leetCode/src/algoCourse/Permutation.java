package algoCourse;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
	public static void main(String[] args) {
		Permutation p = new Permutation();
		int[] nums = {1,2,3};
		
		System.out.println(p.permute(nums));
		
	}
	
    public List<List<Integer>> permute(int[] nums) {
    	List<List<Integer>> list = new ArrayList<>();
    	boolean[] used = new boolean[nums.length];
    	int[] choices = new int[nums.length];
    	
    	makePick(0,nums,used,choices,list);
    	
    	return list;
    }
    
    private void makePick(int index, int[] base, boolean[] used, int[] choices, List<List<Integer>> list) {
    	if(index == choices.length) {
    		List<Integer> temp = new ArrayList<>();
    		for (int i = 0; i < choices.length; i++) {
				temp.add(base[choices[i]]);
			}
    		list.add(temp);
    	} else {
    		for (int i = 0; i < used.length; i++) {
				if (!used[i]) {
					used[i] = true;
					choices[index] = i;
					makePick(index + 1, base, used, choices, list);
					used[i] = false;
				}
			}
    	}
    }
}
