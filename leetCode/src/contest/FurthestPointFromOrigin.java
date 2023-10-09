package contest;

public class FurthestPointFromOrigin {
	public static void main(String[] args) {
		System.out.println(furthestDistanceFromOrigin("_______"));
	}
	
    public static int furthestDistanceFromOrigin(String moves) {
        int l = 0;
        int r = 0;
        int nil = 0;
        
        for (int i = 0; i < moves.length(); i++) {
			switch(moves.charAt(i)) {
			case 'L':
				l++;
				break;
			case 'R':
				r++;
				break;
			case '_':
				nil++;
				break;
			}
		}
        
        return Math.abs(l - r) + nil;
    }
}
