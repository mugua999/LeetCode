package contest;

import java.util.Arrays;

public class MinimumNumberofCoinstobeAdded {
    public int minimumAddedCoins(int[] coins, int target) {
    	Arrays.sort(coins);
        int maxReach = 0, coinsAdded = 0;
        
        for (int coin : coins) {
			while(maxReach + 1 < coin) {
				maxReach += maxReach + 1;
				coinsAdded++;
				
				if(maxReach >= target) {
					return coinsAdded;
				}
			}
			maxReach += coin;
			if(maxReach >= target) {
				return coinsAdded;
			}
		}
        
        while(maxReach < target) {
        	maxReach += maxReach + 1;
        	coinsAdded++;
        }
        
        return coinsAdded;
    }
}
