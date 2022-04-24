

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class WeekestRow {

	public static void main(String[] args) {
		int[][] input = { 
				{ 1, 1, 0, 0, 0 }, 
				{ 1, 1, 1, 1, 0 }, 
				{ 1, 0, 0, 0, 0 }, 
				{ 1, 1, 0, 0, 0 },
				{ 1, 1, 1, 1, 1 } };
		
		int[] output = kWeakestRows(input,3);
		for (int i = 0; i < output.length; i++) {
			System.out.print(output[i] + " ");
		}
	}

	public static int[] kWeakestRows(int[][] mat, int k) {
		Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();

		for (int i = 0; i < mat.length; i++) {
			int counter = 0;
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == 1)
					counter++;
			}
			map.put(i, counter);
		}

		List<Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());

		Collections.sort(list, new Comparator<Entry<Integer, Integer>>() {

			@Override
			public int compare(Entry<Integer, Integer> e1, Entry<Integer, Integer> e2) {
				if (e1.getValue() < e2.getValue()) {
					return -1;
				} else if (e1.getValue() > e2.getValue()) {
					return 1;
				} else if (e1.getKey() < e2.getKey()) {
					return -1;
				} else if (e1.getKey() > e2.getKey()) {
					return 1;
				}
				return 0;
			}
		});
		
		System.out.println(list);
		
		int[] result = new int[k];

		for (int i = 0; i < k; i++) {
			result[i] = list.get(i).getKey();
		}

		return result;
	}

}
