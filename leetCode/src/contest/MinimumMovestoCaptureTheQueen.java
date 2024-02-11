package contest;

public class MinimumMovestoCaptureTheQueen {
	public static void main(String[] args) {
		System.out.println(minMovesToCaptureTheQueen(4,3,3,4,2,5));
	}
	
    public static int minMovesToCaptureTheQueen(int a, int b, int c, int d, int e, int f) {
        // Check if rook can capture in 1 move
        if ((a == e || b == f) && !isBishopBlockingRook(a, b, c, d, e, f)) {
            return 1;
        }

        // Check if bishop can capture in 1 move
        if (Math.abs(c - e) == Math.abs(d - f) && !isRookBlockingBishop(a, b, c, d, e, f)) {
            return 1;
        }

        // Otherwise, rook can capture in 2 moves
        return 2;
    }
    
    private static boolean isBishopBlockingRook(int a, int b, int c, int d, int e, int f) {
    	boolean situ1 = a == c && c == e && b < d && d < f;
    	boolean situ2 = a == c && c == e && b > d && d > f;
    	boolean situ3 = b == d && d == f && a > c && c > f;
    	boolean situ4 = b == d && d == f && a < c && c < f;
    	
    	return situ1 || situ2 || situ3 || situ4;
    }

    private static boolean isRookBlockingBishop(int a, int b, int c, int d, int e, int f) {

        boolean base = (c-a) / (d-b) == (c-e) / (d-f);
        boolean situ1 = base && c < a && a < e;
        
        return false;
    }

}
