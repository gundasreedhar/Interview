public class MaximumProfitByBuyAndSell {

	public static void main(String args[]) {

		int arr[] = { 10, 22, 5, 75, 65, 80 };
		int k = 2;
		int n = arr.length;
		int maxProfit = getMaxProfit(arr, 0, k, n);
		System.out.println("Maximum Profit is " + maxProfit);

	}

	private static int getMaxProfit(int arr[], int index, int k, int n) {

		if (k > 0 && index >= n - 1) {
			return Integer.MIN_VALUE;
		}

		if ((k <= 0 && index <= n - 1) || (index > n - 1)) {
			return 0;
		}

		int maxIgnore = getMaxProfit(arr, index + 1, k, n);
		int max = Integer.MIN_VALUE;
		int buy = arr[index];
		for (int j = index + 1; j < n; j++) {
			int sell = arr[j];
			int diffValue = sell - buy;
			if (diffValue >= 0) {
				int value = diffValue + getMaxProfit(arr, j + 1, k - 1, n);
				max = Math.max(max, value);
			}
		}

		max = Math.max(max, maxIgnore);

		return max;

	}
}