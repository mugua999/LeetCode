import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FloodFill {
	public static void main(String[] args) {
		int[][] image = {
				{0,1,0},
				{0,0,0},
		};
		
		floodFill(image,1,1,2);
	}

	public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
		List<int[]> oldList = new ArrayList<>();
		List<int[]> newList = new ArrayList<>();
		int oldColor = image[sr][sc];
		
		if (oldColor == newColor) return image;
		
		//image[sr][sc] = newColor;
		
		int[] initial = {sr,sc};
		oldList.add(initial);

		while (!oldList.isEmpty()) {
			for (int[] arr : oldList) {

				int rowStart = (arr[0] > 0) ? arr[0] - 1 : arr[0];
				int rowFinish = (arr[0] < image.length - 1) ? arr[0] + 1 : arr[0];
				int colStart = (arr[1] > 0) ? arr[1] - 1 : arr[1];
				int colFinish = (arr[1] < image[arr[0]].length - 1) ? arr[1] + 1 : arr[1];
				
				//System.out.println("start row = " + rowStart);
				for (int i = rowStart; i <= rowFinish; i++) {
					if (image[i][arr[1]] == oldColor) {
						image[i][arr[1]] = newColor;
						int[] temp = {i, arr[1]};
						newList.add(temp);
					}
				}

				for (int i = colStart; i <= colFinish; i++) {
					if (image[arr[0]][i] == oldColor) {
						image[arr[0]][i] = newColor;
						int[] temp = {arr[0],i};
						newList.add(temp);
					}
				}
			}
			
			oldList = new ArrayList<>(newList);
			newList.clear();
			
			for (int i = 0; i < image.length; i++) {
				for (int j = 0; j < image[i].length; j++) {
					System.out.print(image[i][j] + " ");
				}
				System.out.println();
			}
			System.out.println();
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return image;
	}

}
