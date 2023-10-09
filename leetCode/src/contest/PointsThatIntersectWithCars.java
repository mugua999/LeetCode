package contest;

import java.util.List;

public class PointsThatIntersectWithCars {
	public static void main(String[] args) {
		
	}
	
    public int numberOfPoints(List<List<Integer>> nums) {
        int[] carpark = new int[100];
        
        for (List car : nums) {
			int start = (int) car.get(0);
			int end = (int) car.get(1);
			
			for (int i = start; i < end + 1; i++) {
				carpark[i]++;
			}
		}
        
        int occupied = 0;
        
        for (int i = 0; i < carpark.length; i++) {
			if(carpark[i] > 0) occupied++;
		}
        
        return occupied;
    }
}
