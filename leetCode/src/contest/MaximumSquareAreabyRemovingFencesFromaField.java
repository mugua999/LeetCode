package contest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MaximumSquareAreabyRemovingFencesFromaField {
	
	public static void main(String[] args) {
		int[] hFences = {2,3};
		int[] vFences = {2};
		
		System.out.println(maximizeSquareArea(4, 3, hFences, vFences));
	}
	
    public static int maximizeSquareArea(int m, int n, int[] hFences, int[] vFences) {
    	int modulo = (int) (Math.pow(10, 9) + 7);
    	
        if (m == n) return ((m-1) % modulo) * ((n-1) % modulo);
        
        Arrays.sort(hFences);
        Arrays.sort(vFences);
        
        List<Integer> hFence = Arrays.stream(hFences).boxed().collect(Collectors.toList());
        hFence.add(m);
        
        List<Integer> vFence = Arrays.stream(vFences).boxed().collect(Collectors.toList());
        vFence.add(n);
        
        hFence.forEach(i -> System.out.print(i + " "));
        System.out.println();
        vFence.forEach(i -> System.out.print(i + " "));
        System.out.println();
        
        for (int i = hFence.size() - 1; i >= 0; i--) {
			if(vFence.contains(hFence.get(i))) {
				
				System.out.println(hFence.get(i));
				
				return (int) Math.pow(((hFence.get(i) - 1) % modulo), 2);
			}
		}
        
        return -1;
    }
}
