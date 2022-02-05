
public class MaxValueInArrayAfterMRangeOps {

	public static void main(String[] args) {

		int n = 5;
		int m = 3;
		int a[] = { 0, 1, 2 };
		int b[] = { 1, 4, 3 };
		int k[] = { 100, 100, 100 };

		maxValueInArray(a, b, k, n, m);
	}

	private static void maxValueInArray(int[] a, int[] b, int[] k, int n, int m) {

		int arr[] = new int[n + 1];

		for (int i = 0; i < m; i++) {
			arr[a[i]] = arr[a[i]] + k[i];
			arr[b[i] + 1] = arr[b[i] + 1] - k[i];
		}

		int max = Integer.MIN_VALUE;
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum = sum + arr[i];
			max = Math.max(max, sum);
		}

		System.out.println("Maximum after all ranges is " + max);

	}

}
