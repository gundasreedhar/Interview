public class KnapSackMatrixProblem {

	public static void main(String args[]) {
		int val[] = { 7, 8, 4 };
		int wt[] = { 3, 8, 6 };
		int W = 10;
		int n = 3;

		int value = getMaxValueForKnapSack(val, wt, W, n);

		System.out.println("Maximum Knap sack Capacity is " + value);
	}

	private static int getMaxValueForKnapSack(int val[], int wt[], int W, int n) {

		int mat[][] = new int[n + 1][W + 1];

		for (int i = 0; i <= n; i++) {
			for (int w = 0; w <= W; w++) {

				if (i == 0 || w == 0) {
					mat[i][w] = 0;
				}

				else if (wt[i - 1] > w) {
					mat[i][w] = mat[i - 1][w];
				}

				else {
					mat[i][w] = Math.max(mat[i - 1][w - wt[i - 1]] + val[i - 1], mat[i - 1][w]);
				}

			}
		}

		return mat[n][W];

	}

}