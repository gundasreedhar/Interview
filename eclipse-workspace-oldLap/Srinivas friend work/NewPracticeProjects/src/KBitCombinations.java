import java.util.*;

public class KBitCombinations {

	public static void main(String args[]) {

		int noOfBits = 4;
		kbitCombinations(noOfBits);

	}

	public static void kbitCombinations(int noOfBits) {
		// ArrayList<String> DP[][] = new ArrayList<>()[noOfBits][noOfBits];
		List<String>[][] DP = new ArrayList[noOfBits + 1][noOfBits + 1];
		String data = "";
		for (int i = 0; i <= noOfBits; i++) {
			if (DP[i][0] == null) {
				DP[i][0] = new ArrayList(1);
				DP[i][0].add(data);
			}

			data = data + "0";
		}

		for (int len = 1; len <= noOfBits; len++) {
			for (int n = 1; n <= len; n++) {
				if (DP[len - 1][n] != null) {
					for (String dpDataWithOne : DP[len - 1][n]) {
						if (DP[len][n] == null) {
							DP[len][n] = new ArrayList(1);
						}
						DP[len][n].add("0" + dpDataWithOne);
					}
				}

				if (DP[len - 1][n - 1] != null) {
					for (String dpDataWithZero : DP[len - 1][n - 1]) {
						if (DP[len][n] == null) {
							DP[len][n] = new ArrayList(1);
						}
						DP[len][n].add("1" + dpDataWithZero);
					}
				}
			}

		}

		for (int i = 1; i <= noOfBits; i++) {
			System.out.println(DP[noOfBits][i]);
		}

	}

}