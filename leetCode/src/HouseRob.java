
public class HouseRob {
	public static void main(String[] args) {
		int[] nums = {1,2,3,1};
		HouseRob hr = new HouseRob();
		
		System.out.println(hr.rob(nums));
	}
	
    public int rob(int[] nums) {
        boolean[] locked = new boolean[nums.length];
        
        for (int j = 0; j < locked.length; j++) {
			System.out.print(locked[j] + " ");
		}
		System.out.println();
        
        int earning = 0;
        
        int max = start(nums,locked,earning,0);
        
        return max;
    }
    
    private int start(int[] nums, boolean[] locked, int earning, int max) {
    	for (int i = 0; i < nums.length; i++) {
			if(!locked[i]) {
				earning += nums[i];
				for (int j = i - 1; j <= i + 1; j++) {
					if (j >= 0 && j < locked.length) {
						locked[i] = true;
					}
				}
				
				earning = start(nums,locked,earning,max);
			}
			for (int j = 0; j < locked.length; j++) {
				System.out.print(locked[j] + " ");
			}
			System.out.println();
			for (int j = i - 1; j <= i + 1; j++) {
				if (j >= 0 && j < locked.length) {
					locked[i] = false;
				}
			}
			max = (earning > max) ? earning : max;
		}
    	
    	return max;
    }
}
