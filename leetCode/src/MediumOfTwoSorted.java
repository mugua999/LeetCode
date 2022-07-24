
public class MediumOfTwoSorted {
	int[] mids = new int[2];
	int[] nums1, nums2;

	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		this.nums1 = nums1;
		this.nums2 = nums2;
		int left = 0, right = nums1.length - 1, totalLength = nums1.length + nums2.length;
		int mid1 = (left + right) / 2, mid2 = totalLength / 2 - mid1;
		
		findMid(mid1, mid2);
		
		if (totalLength % 2 == 1) return Math.min(nums1[mid1 + 1], nums2[mid2 + 1]);
		else return (Math.max(nums1[mid1], nums2[mid2]) + Math.min(nums1[mid1 + 1], nums2[mid2 + 1])) / 2;
	}

	private void findMid(int mid1, int mid2) {
		if (nums1[mid1] > nums2[mid2 + 1])
			findMid(mid1, (mid2 + nums2.length) / 2);
		else if (nums2[mid2] > nums1[mid1 + 1])
			findMid((mid1 + nums1.length) / 2, mid2);
		else {
			mids[0] = mid1;
			mids[1] = mid2;
		}
	}
}
