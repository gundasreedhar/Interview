
public class MeetingPointProblem {

	public static void main(String[] args) {
		// input the calories burnt matrix

		int A[][] = { { 100, 100, 100 }, { 100, 1, 100 }, { 100, 100, 100 } };

		int h = findMaxPoints(A, 3, 3);

		System.out.println("h is " + h );
	}

	static int findMaxPoints(int A[][], int M, int N) {
		// To store points collected by Person P1
		// when he/she begins journy from start and
		// from end.

		int P1S[][] = new int[M + 1][N + 1];
		int P1E[][] = new int[M + 1][N + 1];

		// To store points collected by Person P2
		// when he/she begins journey from start and
		// from end.
		int P2S[][] = new int[M + 1][N + 1];
		int P2E[][] = new int[M + 1][N + 1];

		// Table for P1's journey from
		// start to meeting cell
		for (int i = 1; i <= N; i++)
			for (int j = 1; j <= M; j++)
				P1S[i][j] = Math.max(P1S[i - 1][j], P1S[i][j - 1]) + A[i - 1][j - 1];

		// Table for P1's journey from
		// end to meet cell
		for (int i = N; i >= 1; i--)
			for (int j = M; j >= 1; j--)
				P1E[i][j] = Math.max(P1E[i + 1][j], P1E[i][j + 1]) + A[i - 1][j - 1];

		// Table for P2's journey from start to meeting cell
		for (int i = N; i >= 1; i--)
			for (int j = 1; j <= M; j++)
				P2S[i][j] = Math.max(P2S[i + 1][j], P2S[i][j - 1]) + A[i - 1][j - 1];

		// Table for P2's journey from end to meeting cell
		for (int i = 1; i <= N; i++)
			for (int j = M; j >= 1; j--)
				P2E[i][j] = Math.max(P2E[i - 1][j], P2E[i][j + 1]) + A[i - 1][j - 1];

		// Now iterate over all meeting positions (i,j)
		int ans = 0;
		for (int i = 2; i < N; i++) {
			for (int j = 2; j < M; j++) {
				int op1 = P1S[i][j - 1] + P1E[i][j + 1] + P2S[i + 1][j] + P2E[i - 1][j];
				int op2 = P1S[i - 1][j] + P1E[i + 1][j] + P2S[i][j - 1] + P2E[i][j + 1];
				ans = Math.max(ans, Math.max(op1, op2));
			}
		}
		return ans;
	}

}
