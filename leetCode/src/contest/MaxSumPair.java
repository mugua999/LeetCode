package contest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MaxSumPair {
	public static void main(String[] args) {
		MaxSumPair msp = new MaxSumPair();
		int[] nums = { 10, 12, 19, 14 };

		System.out.println(msp.maximumSum(nums));
	}

	public int maximumSum(int[] nums) {
		Map<Integer, Integer[]> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			int sum = sumDigits(nums[i]);

			if (map.containsKey(sum)) {
				Integer[] val = map.get(sum);
				Integer[] arr = { nums[i], val[0], val[1] };
				Arrays.sort(arr);
				Integer[] res = { arr[1], arr[2] };

				map.replace(sum, res);
			} else {
				Integer[] arr = { nums[i], 0 };
				map.put(sum, arr);
			}
		}

		int max = -1;

		for (Map.Entry<Integer, Integer[]> entry : map.entrySet()) {
			Integer[] val = entry.getValue();

			if (val[0] != 0 && val[1] != 0) {

				int sum = val[0] + val[1];

				max = (sum > max) ? sum : max;
			}
		}

		return max;
	}

	public int sumDigits(int num) {
		if (num == 0)
			return 0;

		int sum = num % 10;
		int left = num / 10;

		return sum + sumDigits(left);
	}
}
