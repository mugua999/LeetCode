package contest;

public class FindtheArrayConcatenationValue {
	public static void main(String[] args) {
		FindtheArrayConcatenationValue fa = new FindtheArrayConcatenationValue();
		
		int[] nums = {5,14,13,8,12};
		
		System.out.println(fa.findTheArrayConcVal(nums));
	}
	
    public long findTheArrayConcVal(int[] nums) {
        int left = 0, right = nums.length - 1;
        int sum = 0;
        
        while(right > left) {
        	String s = Integer.toString(nums[right]);
        	sum += nums[left] * Math.pow(10, s.length()) + nums[right];
        	left++;
        	right--;
        }
        
        sum = (left == right) ? sum + nums[left] : sum;
        
        return (long)sum;
    }
}
