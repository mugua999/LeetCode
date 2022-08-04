package contest;

import java.util.Arrays;

public class MaxNumOfGroups {
	public static void main(String[] args) {
		MaxNumOfGroups mn = new MaxNumOfGroups();
		int[] grade = {10,6,12,7,3,5};
		
		System.out.println(mn.maximumGroups(grade));
	}
	
    public int maximumGroups(int[] grades) {
        Arrays.sort(grades);
        int pointer = 0, size = 1, count = 1;
        
        while (pointer + size < grades.length) {
        	size++;
        	pointer = pointer + size;
        	if(pointer < grades.length) count++;
        }
        
        return count;
    }
}
