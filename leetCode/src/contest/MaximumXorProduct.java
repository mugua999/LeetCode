package contest;

public class MaximumXorProduct {
	public static void main(String[] args) {
		
		System.out.println(maximumXorProduct(53449611838892L, 712958946092406L, 6));
		
	}
	
    public static int maximumXorProduct(long a, long b, int n) {
        long max = 0;
        long mod = 1000000007L; // 10^9 + 7

        for (long i = 0; i < (1L << n); i++) {
            long xorA = (a ^ i) % mod;
            long xorB = (b ^ i) % mod;
            long product = (xorA * xorB) % mod;

            max = Math.max(product, max);
        }

        return (int) max;
    }
}
