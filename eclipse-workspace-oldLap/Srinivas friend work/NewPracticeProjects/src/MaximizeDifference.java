public class MaximizeDifference {

	public static void main(String args[]) {

		int arr[] = { 4, 8, 9, 2, 20 };
		int k = 2;// two pairs
		int n = arr.length;
		int maximumDiff = maximizeDiff(arr, k, n - 1);

		System.out.println("Maximum Difference is  " + maximumDiff);

	}

	private static int maximizeDiff(int arr[], int k, int n) {

		if ((k == 0 && n >= 0) || (n <= 0)) {
			return 0;
		}

		int max = Integer.MIN_VALUE;
		int a = arr[n];
		for (int i = n - 1; i >= 0; i--) {
			int b = arr[i];
			int diffSum = a - b + maximizeDiff(arr, k - 1, i - 1);
			max = Math.max(max, diffSum);
		}

		return max;
	}
}