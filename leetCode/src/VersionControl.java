
public class VersionControl {
	static int total = 1;
	static int badVersion = 1;
	
	public static void main(String[] args) {
		System.out.println(firstBadVersion(total));
	}

	public static int firstBadVersion(int n) {
		int start = 1, end = n;
        
        while(start <= end){
            int mid = start + (end - start) / 2; //(start+end)/2 cause overflow
            if (isBadVersion(mid)){
                end = mid - 1;
            } else {
            	start = mid + 1;
            }
        }
        
        return start;
	}
	
	public static boolean isBadVersion(int version) {
		return (version < badVersion) ? false:true;
	}
}
