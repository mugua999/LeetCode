package contest;

import java.util.Collections;
import java.util.List;

public class MinimumProcessingTime {
    public int minProcessingTime(List<Integer> processorTime, List<Integer> tasks) {
        Collections.sort(processorTime);
        Collections.sort(tasks);
        
        int time1 = processorTime.get(0) + tasks.get(tasks.size()-1);
        int time2 = processorTime.get(processorTime.size()-1) + tasks.get(3);
        
        return Math.max(time1, time2);
    }
}
