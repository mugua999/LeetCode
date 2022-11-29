package contest;

import java.util.Arrays;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Test {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		
		System.out.println(IntStream.of(arr).boxed().collect(Collectors.toSet()));
	}
}
