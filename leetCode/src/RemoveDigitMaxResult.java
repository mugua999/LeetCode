import java.util.ArrayList;
import java.util.List;

public class RemoveDigitMaxResult {
	public static void main(String[] args) {
		String number = "15454";
		char digit = '4';
		System.out.println(removeDigit(number, digit));
	}

	public static String removeDigit(String number, char digit) {
		StringBuilder sb = new StringBuilder(number);
		List<Integer> matches = new ArrayList<>(); 
		
		for (int i = 0; i < number.length(); i++) {
			if (number.charAt(i) == digit) {
				matches.add(i);
			}
		}
		//System.out.println(matches);
		
		if (matches.size() > 1) {
			for (int i = 0; i<matches.size() - 1; i++) {
				if ((int)sb.charAt(matches.get(i)) < (int)sb.charAt(matches.get(i)+1)) {
					//System.out.println("delete before last one");
					return sb.deleteCharAt(matches.get(i)).toString();
				}
			}
			//System.out.println("delete last one");
			return sb.deleteCharAt(matches.get(matches.size()-1)).toString();
		}else {
			//System.out.println("delet only one");
			return sb.deleteCharAt(matches.get(0)).toString();
		}
	}
}

