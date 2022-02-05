public class MaximumProfitByBuyAndSellAtmostTwoTimes {

	public static void main(String args[]) {

		int arr[] = { 10, 22, 5, 75, 65, 80 };

		int maxProfit = maxProfit(arr);

		System.out.println("MaxProfit is " + maxProfit);

	}

	private static int maxProfit(int arr[]) {

		int len = arr.length;
		int profit[] = new int[len];
		for (int i = 0; i < arr.length; i++) {

			profit[i] = 0;
		}

		int max_price = arr[len - 1];
		for (int i = len - 2; i >= 0; i--) {
			if (arr[i] > max_price) {
				max_price = arr[i];
			}

			profit[i] = Math.max(profit[i + 1], max_price - arr[i]);

		}

		int min_price = arr[0];
		for (int i = 1; i <= len - 1; i++) {
			if (arr[i] < min_price) {
				min_price = arr[i];
			}

			profit[i] = Math.max(profit[i - 1], profit[i] + arr[i] - min_price);
		}

		return profit[len - 1];
	}

}