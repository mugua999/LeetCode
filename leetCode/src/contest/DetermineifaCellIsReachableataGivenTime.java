package contest;

public class DetermineifaCellIsReachableataGivenTime {
	public static void main(String[] args) {
		int sx = 1, sy = 4, fx = 1, fy = 2, t = 1;
		
		System.out.println(isReachableAtTime(sx, sy, fx, fy, t));
	}
    public static boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {
        int dist1 = Math.abs(fx - sx);
        int dist2 = Math.abs(fy - sy);
        
        if(dist1 == 0 && dist2 == 0 && t == 1) return false;
        
        int firsttry = (dist1 > dist2) ? dist2 : dist1;
        System.out.println("first = " + firsttry);
        int secondtry = Math.max(dist1, dist2) - firsttry;
        System.out.println("second = " + secondtry);
        
        int minTime = firsttry + secondtry;
        
        System.out.println(minTime);
        
        return minTime <= t;
    }
}
