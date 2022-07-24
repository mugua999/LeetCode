package contest;

public class MinLines {
	public static void main(String[] args) {
		int[][] stockPrices = {{1,7},{2,6},{3,5},{4,4},{5,4},{6,3},{7,2},{8,1}};
		System.out.println(minimumLines(stockPrices));
	}

	public static int minimumLines(int[][] stockPrices) {
		int start = 0, probe = 0, count = 1;
		
		while (start < stockPrices.length - 1 && probe < stockPrices.length - 1) {
			
			double height = stockPrices[start + 1][1] - stockPrices[start][1];
			double width = stockPrices[start + 1][0] - stockPrices[start][0];
			double oldSlope = height / width;
			probe = start;
			boolean equals = true;

			while (probe < stockPrices.length - 1 && equals == true) {
				double newHeight = stockPrices[probe + 1][1] - stockPrices[probe][1];
				double newWidth = stockPrices[probe + 1][0] - stockPrices[probe][0];
				double newSlope = newHeight / newWidth;
				if (newSlope != oldSlope) {
					
					System.out.println("slope change");
					System.out.println(stockPrices[probe][0] + " " + stockPrices[probe][1]);
					
					equals = false;
					start = probe;
					count++;
				}
				probe++;
			}
			
		}

		return count;
	}
}
