import java.util.Arrays;

public class ContainerWithMaxWater {
	public static void main(String[] args) {
		ContainerWithMaxWater cm = new ContainerWithMaxWater();
		int[] height = { 1,8,6,2,5,4,8,25,7 };

		System.out.println(cm.maxArea(height));
	}

	public int maxArea(int[] height) {
		int max = 0;

		for (int i = 0; i < height.length; i++) {
			int left = 0, right = height.length - 1;
			
			int leftArea = 0, rightArea = 0;
			while (left < i) {
				if (height[left] >= height[i]) {
					leftArea = (i - left) * height[i];
					break;
				} else {
					left++;
				}
			}

			while (right > i) {
				if (height[right] >= height[i]) {
					rightArea = (right - i) * height[i];
					break;
				} else {
					right--;
				}
			}

			max = Math.max(max, Math.max(leftArea, rightArea));
		}

		return max;
	}
}
