package contest;

import java.util.Map;
import java.util.TreeMap;

public class SortPeople {
    public String[] sortPeople(String[] names, int[] heights) {
    	Map<Integer, String> map = new TreeMap<>();
    	
    	for (int i = 0; i < heights.length; i++) {
			map.put(heights[i], names[i]);
		}
    	
    	int i = names.length - 1;
    	
    	for (Map.Entry<Integer, String> entry : map.entrySet()) {
			String val = entry.getValue();
			
			names[i] = val;
			i--;
		}
    	
    	return names;
    }
}
