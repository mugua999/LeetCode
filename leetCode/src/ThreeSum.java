import java.util.ArrayList;
import java.util.List;

public class ThreeSum {
	public static void main(String[] args) {
		ThreeSum ts = new ThreeSum();
		int[] nums = {-1,0,1,2,-1,-4};
		
		System.out.println(ts.threeSum(nums));
	}
	
    public List<List<Integer>> threeSum(int[] nums) {
        int[] selections = new int[3];
        List<List<Integer>> res = new ArrayList<>();
        
        makeSelection(0,selections, nums, res);
        
        return res;
    }
    
    public void makeSelection(int index, int[] selection, int[] dataBase, List<List<Integer>> res) {
    	if (index == selection.length) {
    		int total = 0;
    		for (int i = 0; i < selection.length; i++) {
				total += dataBase[selection[i]];
			}
    		
    		if (total == 0) {
    			List<Integer> list = new ArrayList<>();
    			for (int i = 0; i < selection.length; i++) {
					list.add(dataBase[selection[i]]);
				}
    			
    			list.sort(null);
    			
    			if (!res.contains(list)) 
    				res.add(list);
    		}
    	} else {
    		int start = 0;
    		if (index > 0) start = selection[index - 1] + 1;
    		
    		for (int i = start; i < dataBase.length; i++) {
				selection[index] = i;
				makeSelection(index + 1, selection, dataBase, res);
			}
    	}
    }
}
