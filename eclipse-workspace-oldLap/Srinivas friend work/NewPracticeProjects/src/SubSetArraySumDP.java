
public class SubSetArraySumDP {
	public static void main(String[] args) {
		int set[] = { 3, 34, 4, 12, 5, 2 };
		int sum = 9;

		boolean isSumSubsetPresent = findIfSubSetSumThere(set, set.length, sum);
		
		System.out.println("isSumSubsetPresent is " + isSumSubsetPresent);
	}

	private static boolean findIfSubSetSumThere(int[] set, int length, int sum) {
		int n = set.length;
		boolean[][] dp = new boolean[set.length + 1][sum + 1];

		for (int i = 0; i <= n; i++) {
			dp[i][0] = true;
		}

		for (int j = 1; j <= sum; j++) {
			dp[0][j] = false;
		}

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= sum; j++) {

				if(j<set[i-1]){
					dp [i][j] = dp[i-1][j];
				}
				else if(j>= set[i-1]){
					dp[i][j] =  dp[i-1][j] || dp[i-1][j-set[i-1]];
				}
			}
		}
		
		
		return dp[n][sum];

	}

}
