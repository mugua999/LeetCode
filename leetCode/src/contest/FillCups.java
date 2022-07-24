package contest;

import java.util.Arrays;

public class FillCups {
	public static void main(String[] args) {
		FillCups fc = new FillCups();
		int[] arr = {0,0,5};
		
		System.out.println(fc.fillCups(arr));
	}
	
	public int fillCups(int[] amount) {
		int count = 0;
		
		while (!isEmpty(amount)) {
			Arrays.sort(amount);
			if(amount[1] > 0) {
				amount[1]--;
				amount[2]--;
			} else {
				amount[2]--;
			}
			
			count++;
		}
		
		return count;
	}
	
	private boolean isEmpty(int[] amount) {
		for (int i = 0; i < amount.length; i++) {
			if (amount[i] != 0) return false;
		}
		
		return true;
	}
	
}
