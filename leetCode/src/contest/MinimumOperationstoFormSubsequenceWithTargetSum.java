package contest;

import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class MinimumOperationstoFormSubsequenceWithTargetSum {
	public static void main(String[] args) {
		List<Integer> nums = new LinkedList<>();
		nums.add(1);
		nums.add(32);
		nums.add(1);
		nums.add(2);
		
		System.out.println(minOperations(nums, 12));
	}
	
    public static int minOperations(List<Integer> nums, int target) {
        Queue<Integer> pq = new PriorityQueue<>();

        pq.addAll(nums);
        
        int sum = 0;
        
        while(!pq.isEmpty() && sum + pq.peek() < target) {
        	sum += pq.poll();
        }
        
        if (pq.peek() == null) return -1;
        
        int floor = pq.poll();
        
        int diff = target - sum;
        double diffLvLong = Math.log(diff) / Math.log(2);
        int diffLv = 0;
        
        if (diffLvLong - (int)diffLvLong != 0) {
        	return -1;
        } else {
        	diffLv = (int)diffLvLong;
        }
        
        int floorLv = (int) (Math.log(floor) / Math.log(2));
        
        return floorLv - diffLv;
    }
}
