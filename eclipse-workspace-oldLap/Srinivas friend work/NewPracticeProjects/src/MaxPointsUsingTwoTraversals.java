public class MaxPointsUsingTwoTraversals {

	public static void main(String args[]) {
		int mat[][] = { { 3, 6, 8, 2 }, { 5, 2, 4, 3 }, { 1, 1, 20, 10 }, { 1, 1, 20, 10 }, { 1, 1, 20, 10 }, };
		int n = 5;
		int m = 4;

		int max = findMaxPoints(mat, 0, 0, 3, n, m);
		System.out.println("Maximum value is " + max);

	}

	static int findMaxPoints(int mat[][], int x, int y1, int y2, int n, int m) {

		if (isNotValid(mat, x, y1, y2, n, m)) {
			return Integer.MIN_VALUE;
		}

		if ((x == n - 1) && (y1 == 0) && (y2 == 3)) {
			if (y1 == y2)
				return mat[x][y1];
			else {
				return mat[x][y1] + mat[x][y2];
			}
		}

		int temp = 0;
		if (x == n - 1)
			return Integer.MIN_VALUE;

		if (y1 == y2) {
			temp = mat[x][y1];
		}

		else {
			temp = mat[x][y1] + mat[x][y2];
		}

		int max = Integer.MIN_VALUE;

		max = Math.max(max, temp + findMaxPoints(mat, x + 1, y1, y2, n, m));
		max = Math.max(max, temp + findMaxPoints(mat, x + 1, y1, y2 - 1, n, m));
		max = Math.max(max, temp + findMaxPoints(mat, x + 1, y1, y2 + 1, n, m));

		max = Math.max(max, temp + findMaxPoints(mat, x + 1, y1 - 1, y2, n, m));
		max = Math.max(max, temp + findMaxPoints(mat, x + 1, y1 - 1, y2 - 1, n, m));
		max = Math.max(max, temp + findMaxPoints(mat, x + 1, y1 - 1, y2 + 1, n, m));

		max = Math.max(max, temp + findMaxPoints(mat, x + 1, y1 + 1, y2, n, m));
		max = Math.max(max, temp + findMaxPoints(mat, x + 1, y1 + 1, y2 - 1, n, m));
		max = Math.max(max, temp + findMaxPoints(mat, x + 1, y1 + 1, y2 + 1, n, m));

		return max;

	}

	static boolean isNotValid(int mat[][], int x, int y1, int y2, int n, int m) {

		if ((x > n - 1) || (y1 < 0 || y1 > m - 1) || (y2 < 0 || y2 > m - 1))
			return true;

		return false;
	}

}