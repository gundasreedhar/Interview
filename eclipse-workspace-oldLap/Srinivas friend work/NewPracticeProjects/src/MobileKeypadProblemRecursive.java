
public class MobileKeypadProblemRecursive {

	static int row[] = { 0, 1, 0, 0, -1 };
	static int col[] = { 0, 0, -1, 1, 0 };

	public static void main(String args[]) {

		char[][] data = { { '1', '2', '3' }, { '4', '5', '6' }, { '7', '8', '9' }, { '*', '0', '#' } };

		System.out.println("Solution is " + getCountPermutes(data, 2));

	}

	public static int getCountPermutes(char data[][], int n) {
		int totalCount = 0;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				if (data[i][j] != '#' && data[i][j] != '*') {

					totalCount = totalCount + getCountUtil(data, i, j, n);
				}
			}
		}

		return totalCount;
	}

	public static int getCountUtil(char data[][], int i, int j, int n) {
		int totalCount = 0;
		if (data == null && (n <= 0))
			return 0;

		if (n == 1)
			return 1;

		for (int move = 0; move < 5; move++) {

			int r0 = row[move] + i;
			int c0 = col[move] + j;
			if ((r0 >= 0 && r0 < 4) && (c0 >= 0 && c0 < 3) && (data[r0][c0] != '*' && data[r0][c0] != '#')) {
				totalCount = totalCount + getCountUtil(data, r0, c0, n - 1);
			}
		}

		return totalCount;
	}

}
