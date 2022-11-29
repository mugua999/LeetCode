package contest;

public class EvenNumbersThatAreDivisiblebyThree {
	
	public static void main(String[] args) {
		EvenNumbersThatAreDivisiblebyThree e = new EvenNumbersThatAreDivisiblebyThree();
		int[] nums = {43,9,75,76,25,96,46,85,19,29,88,2,5,24,60,26,76,24,96,82,97,97,72,35,21,77,82,30,94,55,76,94,51};
		
		System.out.println(e.averageValue(nums));
	}
	
    public int averageValue(int[] nums) {
    	int total = 0;
    	int count = 0;
        for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 6 == 0) {
				//avg = (int) Math.floor(avg + (nums[i] - avg) / count);
				total += nums[i];
				count++;
			}
		}
        
        return total / count;
    }
}
