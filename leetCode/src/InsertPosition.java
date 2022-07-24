import java.util.Arrays;

public class InsertPosition {
	public static void main(String[] args) {
		int[] nums = {-1,0,3,5,9};
		System.out.println(searchInsert(nums, 11));
	}
	
	public static int searchInsert(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        
        while (start <= end) {
        	int mid = start + (end - start) / 2;
        	if (nums[mid] == target) return mid;
        	if (nums[mid] < target) start = mid + 1;
        	else end = mid - 1;
        }
        
       return start;
    }
}
