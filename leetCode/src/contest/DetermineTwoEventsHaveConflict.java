package contest;

public class DetermineTwoEventsHaveConflict {
    public boolean haveConflict(String[] event1, String[] event2) {
        int[] time = new int[1441];
        
        int startTime1 = Integer.parseInt(event1[0].substring(0, 2)) * 60 + Integer.parseInt(event1[0].substring(3, 5));
        int endTime1 = Integer.parseInt(event1[1].substring(0, 2)) * 60 + Integer.parseInt(event1[1].substring(3, 5));
        int startTime2 = Integer.parseInt(event2[0].substring(0, 2)) * 60 + Integer.parseInt(event2[0].substring(3, 5));
        int endTime2 = Integer.parseInt(event2[1].substring(0, 2)) * 60 + Integer.parseInt(event2[1].substring(3, 5));
        
        for (int i = startTime1; i <= endTime1; i++) {
			time[i]++;
		}
        
        for (int i = startTime2; i <= endTime2; i++) {
			time[i]++;
		}
        
        for (int i = 0; i < time.length; i++) {
			if(time[i] > 1) return true;
		}
        
        return false;
    }
}	
