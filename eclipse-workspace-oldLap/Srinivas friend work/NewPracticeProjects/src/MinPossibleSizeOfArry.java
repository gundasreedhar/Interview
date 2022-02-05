public class MinPossibleSizeOfArry {

	public static void main(String args[]) {
		int arr[] = { 2, 3, 4, 5, 6, 4 };
		int k = 1;
		int low = 0;
		int high = arr.length - 1;
		int minSize = findMinPossibleUtil(arr, low, high, k);

		System.out.println("minimum Possible Size of array is " + minSize);

	}

	private static int findMinPossibleUtil(int arr[], int low, int high, int k) {


		if (high - low + 1 < 3) {
			return high - low + 1;
		}

		int res = 1 + findMinPossibleUtil(arr, low + 1, high, k);

		for (int i = low + 1; i <= high - 1; i++) {
			for (int j = i + 1; j <= high; j++) {

				if ((arr[i] - arr[low] == k) && (arr[j] - arr[i] == k)
						&& (findMinPossibleUtil(arr, low + 1, i - 1, k) == 0)
						&& (findMinPossibleUtil(arr, i + 1, j - 1, k) == 0))
					res = Math.min(res, findMinPossibleUtil(arr, j + 1, high, k));
			}
		}

		return res;

	}

}
