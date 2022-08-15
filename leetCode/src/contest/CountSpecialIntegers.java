package contest;

public class CountSpecialIntegers {
	public static void main(String[] args) {
		CountSpecialIntegers spi = new CountSpecialIntegers();
		System.out.println(spi.countSpecialNumbers(78350035));
	}
	
    public int countSpecialNumbers(int n) {
    	int count = 0;
        for (int i = 1; i <= n; i++) {
        	int thisNumber = i;
        	boolean special = true;
			int[] arr = new int[10];
			
			while (thisNumber > 0 && special) {
				int lastInt = thisNumber % 10;
				thisNumber /= 10;
				
				if(arr[lastInt] < 1) {
					arr[lastInt]++;
				} else {
					special = false;
				}
			}
			
			if (special) count++;
		}
        
        return count;
    }
}
