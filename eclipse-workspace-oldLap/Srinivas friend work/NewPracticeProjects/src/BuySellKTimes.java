public class BuySellKTimes {

	public static void main(String args[]) {

		int arr[] = { 10, 22, 5, 75, 65, 80 };
		int k = 2;
		int profit = buyOrSellMaxKTimes(arr, k);
		System.out.println("Profit is " + profit);

	}

	private static int buyOrSellMaxKTimes(int arr[], int k) {

		int n = arr.length;
		int profit[][] = new int[k + 1][n + 1];

		for (int i = 0; i <= n; i++) {
			profit[0][i] = 0;
		}

		for (int j = 0; j <= k; j++) {
			profit[j][0] = 0;
		}

		for (int i = 1; i <= k; i++) {
			for (int j = 1; j < n; j++) {
				int max_so_far = Integer.MIN_VALUE;
				for (int m = 0; m < j; m++) {
					max_so_far = Math.max(max_so_far, arr[j] - arr[m] + profit[i - 1][m]);
				}

				profit[i][j] = Math.max(max_so_far, profit[i][j - 1]);

			}

		}
		return profit[k][n - 1];

	}

}