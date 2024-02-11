package contest;

import java.util.Arrays;
import java.util.Collections;

public class CountElementsWithMaximumFrequency {
    public int maxFrequencyElements(int[] nums) {
        int[] freq = new int[101];
        int totalFreq = 0;
        
        for (int i : nums) {
			freq[i]++;
		}
        
        Arrays.sort(freq);
        
        int pointer = freq.length - 1;
        
        do {
        	totalFreq += freq[pointer];
        	
        	pointer--;
        }while(freq[pointer] == freq[pointer + 1] && pointer >=0);
        
        return totalFreq;
    }
}
