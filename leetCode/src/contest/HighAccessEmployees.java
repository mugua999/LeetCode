package contest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeSet;

public class HighAccessEmployees {
    public List<String> findHighAccessEmployees(List<List<String>> access_times) {
        Map<String, List<Integer>> map = new HashMap<>();
        List<String> highA = new ArrayList<>();
        
        for (List<String> list : access_times) {
        	String key = list.get(0);
        	int value = Integer.parseInt(list.get(1));
        	
			if(map.containsKey(key)) {
				map.get(key).add(value);
			} else {
				List<Integer> tree = new ArrayList<>();
				tree.add(value);
				map.put(key, tree);
			}
		}
        
        for (Entry<String, List<Integer>> entry : map.entrySet()) {
			String key = entry.getKey();
			List<Integer> list = entry.getValue();
			
			if(list.size() > 2) {
				Collections.sort(list);
				for (int i = 0; i < list.size() - 2; i++) {
					if (calculateTimeDifference(list.get(i),list.get(i + 2)) < 60) {
						highA.add(key);
						break;
					}
				}
			}
		}
        
        return highA;
    }
    
    private static int calculateTimeDifference(int time1, int time2) {
        int hours1 = time1 / 100;
        int minutes1 = time1 % 100;

        int hours2 = time2 / 100;
        int minutes2 = time2 % 100;

        // Convert times to total minutes
        int totalMinutes1 = hours1 * 60 + minutes1;
        int totalMinutes2 = hours2 * 60 + minutes2;

        // Calculate the difference in minutes
        return Math.abs(totalMinutes2 - totalMinutes1);
    }
}
