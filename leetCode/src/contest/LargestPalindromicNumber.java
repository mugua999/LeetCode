package contest;

public class LargestPalindromicNumber {
	public static void main(String[] args) {
		LargestPalindromicNumber lpn = new LargestPalindromicNumber();
		
		System.out.println(lpn.largestPalindromic("00000"));
	}
	
    public String largestPalindromic(String num) {
        int[] nums = new int[10];
        
        for (int i = 0; i < num.length(); i++) {
			nums[num.charAt(i) - 48]++;
		}
        
        StringBuilder sb = new StringBuilder();
        int pointer = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
			while(nums[i] > 1) {
				sb.insert(pointer, i);
				sb.insert(pointer, i);
				nums[i] -= 2;
				pointer++;
			}
		}
        
        for (int i = nums.length - 1; i >= 0; i--) {
        	if (nums[i] > 0) {
        		sb.insert(pointer, i);
        		break;
        	}
        }
        
        for (int i = 0; i < sb.length(); i++) {
			if (sb.charAt(i) == '0' && sb.length() > 1) {
				sb.deleteCharAt(i);
				sb.deleteCharAt(sb.length() - 1 - i);
				i--;
			} else break;
		}
        
        return sb.toString();
    }
}
