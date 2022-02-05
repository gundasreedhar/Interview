public class LongestCommonSubstring {

	public static void main(String args[]) {
		String str1 = "geeksforgeeks";
		String str2 = "geeksquiz";

		int longestSubStringLen = longestCommonSubstring(str1, str2);
		System.out.println("Maximum Len substr is " + longestSubStringLen);

	}

	private static int longestCommonSubstring(String str1, String str2) {

		int n = str1.length();
		int m = str2.length();
		int mat[][] = new int[n + 1][m + 1];

		int maxSubStringLen = Integer.MIN_VALUE;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {

				if ((str1.charAt(i - 1) == str2.charAt(j - 1))) {
					mat[i][j] = mat[i - 1][j - 1] + 1;
				}

				else {
					mat[i][j] = 0;
				}

				if (mat[i][j] > maxSubStringLen) {
					maxSubStringLen = mat[i][j];
				}
			}

		}

		return maxSubStringLen;

	}

}