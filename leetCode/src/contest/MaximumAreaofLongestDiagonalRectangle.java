package contest;

public class MaximumAreaofLongestDiagonalRectangle {
    public int areaOfMaxDiagonal(int[][] dimensions) {
    	double maxDiag = 0, maxArea = 0;
        for (int i = 0; i < dimensions.length; i++) {
			double diag = Math.sqrt(Math.pow((double)dimensions[i][0], 2) + Math.pow((double)dimensions[i][1], 2));
			int area = dimensions[i][0] * dimensions[i][1];
			
			if(diag > maxDiag) {
				maxDiag = diag;
				maxArea = area;
			} else if (diag == maxDiag) {
				maxArea = (maxArea > area) ? maxArea : area;
			}
		}
        
        return (int)maxArea;
    }
}
