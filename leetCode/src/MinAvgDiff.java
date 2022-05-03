
public class MinAvgDiff {
	public static void main(String[] args) {
		int[] nums = {5,4,3,2,1};

		System.out.println(minimumAverageDifference(nums));
	}

	public static int minimumAverageDifference(int[] nums) {
		int length = nums.length;
		int min = Integer.MAX_VALUE;
		int minIndex = -1;
		
		for (int i = 0; i < length; i++) {
			double firstAvg = 0,  secAvg = 0, diff;
			
			int firstBase = 1;
			for(int j = 0; j < i+1; j++) {
				firstAvg += (nums[j] - firstAvg) / firstBase;
				++firstBase;
			}
			//System.out.println("first average is " + firstAvg);
			
			int base = 1;
			for (int j = i + 1; j < length; j++) {
				secAvg += (nums[j] - secAvg) / base;
				++base;
			}
			//System.out.println("second average is " + secAvg);
			
			diff = Math.abs(firstAvg - secAvg);
			System.out.println(" index " + i + " diff is " + diff);
			if (diff < min) {
				min = (int)diff;
				minIndex = i;
			}
		}
		
		return minIndex;
	}
}
