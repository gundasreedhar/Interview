package SrinivasPrograms;

public class MaxSumSubArray {

	public static void main(String args[]) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int sum = 9;
		int n = arr.length;
		findMaxSumAubArray(arr, n, sum);
	}

	private static void findMaxSumAubArray(int arr[], int n, int sum) {
		int mat[][] = new int[n][n];
		for (int i = 0; i < n; i++) {
			mat[i][i] = arr[i];
		}
		int k = 1;
		while (k < n) {
			int i = 0;
			while (i < n - k) {
				int j = i + k;
				int a = 0;
				int b = 0;
				if (j - 1 >= 0) {
					a = mat[i][j - 1];
				}
				b = mat[i + 1][j];
				mat[i][j] = a + b;
				if (Math.abs(a - b) >= 2) {
					mat[i][j] = mat[i][j] - mat[j - 1][j - 1];
				}
				i++;
			}
			k++;
		}
		checkMaxSizeSubArray(mat, sum, n);
	}

	private static void checkMaxSizeSubArray(int[][] mat, int sum, int n) {
		int maxValue = Integer.MIN_VALUE;
		int len = 0;
		int startIndex = -1;
		int endIndex = -1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (sum == mat[i][j]) {
					int tempLen = j - i + 1;
					if (maxValue < len) {
						len = tempLen;
						startIndex = i;
						endIndex = j;
						maxValue = len;
					}
				}
			}
		}
		System.out.println("Max Size SubArray with len : " + len);
		System.out.println("Max Size SubArray with startIndex : " + startIndex);
		System.out.println("Max Size SubArray with endIndex : " + endIndex);
	}
}