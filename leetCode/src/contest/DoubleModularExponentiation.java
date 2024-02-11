package contest;

import java.util.LinkedList;
import java.util.List;

public class DoubleModularExponentiation {
    public List<Integer> getGoodIndices(int[][] variables, int target) {
        List<Integer> ans = new LinkedList<>();
        
        for (int i = 0; i < variables.length; i++) {
			double result = Math.pow((Math.pow(variables[i][0], variables[i][1]) % 10), variables[i][2]) % variables[i][3];
			
			if (result == target) ans.add(i);
		}
        
        return ans;
    }
    
    public long modularExpo(long base, long expo, long modulo) {
    	long result = 1;
    	base %= modulo;
    	
    	while(expo > 0) {
    		if(expo % 2 == 1) {
    			result = (result * base) % modulo;
    		}
    		base = (base * base) % modulo;
    		expo /= 2;
    	}
    	
    	return result;
    }
}
