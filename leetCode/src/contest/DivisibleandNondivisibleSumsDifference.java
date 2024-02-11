package contest;

public class DivisibleandNondivisibleSumsDifference {
	public static void main(String[] args) {
		System.out.println(differenceOfSums(5, 1));
	}
	
    public static int differenceOfSums(int n, int m) {
        int num1 = 0, num2 = 0;
        for (int i = 0; i <= n; i++) {
			if(i % m != 0) {
				num1 += i;
			} else {
				num2 += i;
			}
		}
        
        return num1 - num2;
    }
}
