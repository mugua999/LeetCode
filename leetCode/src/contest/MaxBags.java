package contest;

import java.util.Arrays;

public class MaxBags {
	public static void main(String[] args) {
		int[] capacity = {10,2,2}, rocks = {2,2,0};
		int additionalRocks = 100;
		
		System.out.println(maximumBags(capacity, rocks, additionalRocks));
	}

	public static int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
		int[] empty = new int[capacity.length];
		for (int i = 0; i < empty.length; i++) {
			empty[i] = capacity[i] - rocks[i];
		}
		
		Arrays.sort(empty);
		
		for (int i = 0; i < empty.length; i++) {
			System.out.print(empty[i] + " ");
		}
		System.out.println();
		
		int count = 0;
		for (int i = 0; i < empty.length; i++) {
			additionalRocks -= empty[i];
			if (additionalRocks >= 0) count++;
			else break;
		}
		
		return count;
	}
}
