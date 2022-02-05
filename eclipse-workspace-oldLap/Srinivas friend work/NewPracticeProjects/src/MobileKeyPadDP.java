public class MobileKeyPadDP {

	static int row[] = { 0, 1, 0, 0, -1 };
	static int col[] = { 0, 0, -1, 1, 0 };

	public static void main(String args[]) {
		char data[][] = { { '1', '2', '3' }, { '4', '5', '6' }, { '7', '8', '9' }, { '#', '0', '#' } };

		int n = 2;

		int result = mobileKeyPadDP(data, n);

		System.out.println("result is " + result);

	}

	public static int mobileKeyPadDP(char data[][], int n) {

		int count[][] = new int[10][n + 1];
		for (int i = 0; i < 10; i++) {
			count[i][0] = 0;
			count[i][1] = 1;

		}

		for (int k = 2; k <= n ;k++) {

			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 3; j++) {
					if (data[i][j] != '#' && data[i][j] != '*') {
						int num = data[i][j] - '0';
						for (int move = 0; move < 5; move++) {
							int r0 = i + row[move];
							int c0 = j + col[move];
							if (r0 >= 0 && r0 < 4 && c0 >= 0 && c0 < 3 && data[r0][c0] != '#' && data[r0][c0] != '*') {
								int newNum = data[r0][c0] - '0';
								
								count[num][k] = count[num][k] + count[newNum][k - 1];
							}
						}

					}
				}
			}

		}

		int totalCount = 0;
		for (int i = 0; i <= 9; i++) {
			totalCount = totalCount + count[i][n];
		}

		return totalCount;
	}

}