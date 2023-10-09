package contest;

public class MinimumOperationstoMakeaSpecialNumber {
	public static void main(String[] args) {
		System.out.println(minimumOperations("2908305"));
	}
	
	public static int minimumOperations(String num) {
		int skip = 0, remove = 0;
		int valid = -1;
		
		for (int i = num.length() - 1; i >= 0; i--) {
			int digit = num.charAt(i) - 48;
			
			switch(skip) {
			case 0:
				if(digit == 0 || digit == 5) {
					valid = digit;
					skip++;
				} else {
					remove++;
				}
				break;
			case 1:
				if((valid == 0 && digit == 0) || (valid == 0 && digit == 5) || (valid == 5 && digit == 2) || (valid == 5 && digit == 7)) {
					return remove;
				} else if (digit == 0 || digit == 5){
					skip--;
					remove++;
				} else {
					remove++;
				}
			default:
				break;
			}
		}
		
		return remove;
	}
}
