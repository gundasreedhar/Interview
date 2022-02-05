
public class WordWrapProblem {

	public static void main(String[] args) {
		int[] dataArr = { 6, 3, 5, 2, 4 };

		int nOfRows = 5;
		int noOfColumns = 5;
		int limitPerLine = 10;
		int placeMat[][] = new int[nOfRows][noOfColumns];

		for (int i = 0; i < nOfRows; i++) {
			for (int j = 0; j < noOfColumns; j++) {

				if (i > j) {
					continue;
				}

				int iter = 0;
				int sum = 0;
				for (int k = i; k <= j; k++) {
					sum = sum + dataArr[k];
					iter = iter + 1;
				}
				sum = sum + iter - 1;
				if (sum <= limitPerLine) {
					int actualData = limitPerLine - sum;
					int dataToBeStored = actualData * actualData;
					placeMat[i][j] = dataToBeStored;
				} else {
					placeMat[i][j] = Integer.MAX_VALUE;
				}
			}
		}

		int cost[] = new int[5];
		int pathHolder[] = new int[5];

		int lastPointer = 4;
		for (int i = 4; i >= 0; i--) {
			recurseCode(placeMat, cost, lastPointer, i);

		}

		System.out.println("Minimum cost is " + cost[0]);
	}

	private static int recurseCode(int[][] placeMat, int[] cost, int lastPointer, int i) {
		int costTemp = 0;
		if (placeMat[i][lastPointer] != Integer.MAX_VALUE) {
			cost[i] = placeMat[i][lastPointer];
		} else {
			cost[i] = Integer.MAX_VALUE;
			for (int k = lastPointer; k > i; k--) {
				cost[i] = Math.min(cost[i], cost[k] + recurseCode(placeMat, cost, k - 1, i));
			}
		}

		costTemp = cost[i];

		return costTemp;
	}

}
