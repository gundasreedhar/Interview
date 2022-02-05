public class ClassicKnapSack {

	public static void main(String args[]) {

		int val[] = { 7, 8, 4 };
		int wt[] = { 3, 8, 6 };
		int n = val.length;
		int maxKnapSackCapacity = 10;
		int maxValue = maximumValueFromKnapSack(wt, val, n, maxKnapSackCapacity, 0);
		System.out.println("Maximum value is " + maxValue);

	}

	private static int maximumValueFromKnapSack(int wt[], int val[], int n, int sum, int i) {

		if (i >= n) {
			return 0;
		}

		if (sum < wt[i]) {
			return maximumValueFromKnapSack(wt, val, n, sum, i + 1);
		}

		return Math.max(val[i] + maximumValueFromKnapSack(wt, val, n, sum - wt[i], i + 1),
				maximumValueFromKnapSack(wt, val, n, sum, i + 1));
	}
}