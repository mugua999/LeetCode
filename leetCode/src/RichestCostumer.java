

public class RichestCostumer {
	public static void main(String[] args) {
		int[][] accounts = {{2,8,7}, {7,1,3}, {1,9,5}};
		System.out.println(maximumWealth(accounts));
	}

	public static int maximumWealth(int[][] accounts) {
		int highestWealth = 0;
		
		for (int i = 0; i < accounts.length; i++) {
			int totalWealth = 0;
			for (int j = 0; j < accounts[i].length; j++) {
				totalWealth += accounts[i][j];
			}
			
			if (totalWealth > highestWealth) highestWealth = totalWealth;
		}
		
		return highestWealth;
	}
}
