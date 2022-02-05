import java.util.Scanner;

public class FindMaxSumValuesWithinKDifference {

	public static void main(String[] args) {
		int arr[] = { 2, 5, 1, 2, 7, 3, 0 };

		Scanner sc = new Scanner(System.in);

		int k = sc.nextInt();

		int sumPairs = sc.nextInt();

		int preProcess[] = new int[arr.length];
		preProcess[0] = arr[0];

		int initialSum = 0;

		for (int m = 0; m < k; m++) {
			initialSum = initialSum + arr[m];
		}
		for (int i = 1; i < arr.length; i++) {

			if (i < k - 1) {
				preProcess[i] = arr[i];
			} else if (i == k - 1) {
				preProcess[i] = initialSum;
			}

			else {
				preProcess[i] = preProcess[i - 1] - arr[i - k] + arr[i];
			}
		}

		findMaxSum(preProcess, k);
		System.out.println("Stop here ");
	}

	private static void findMaxSum(int[] preProcess, int k) {
		int maxSum = Integer.MIN_VALUE;
		int firstPreIndex = -1;
		int secondPreIndex = -1;
		for (int i = 0; i < preProcess.length-k; i++) {
			int sum = preProcess[i] + preProcess[i + k];
			if (maxSum < sum) {
				maxSum = sum;
				firstPreIndex = i;
				secondPreIndex = i+k;
			}

		}

		System.out.println("Pairs are " +  (firstPreIndex -2 ) + ", " + firstPreIndex );
		System.out.println("Pairs are " +  (secondPreIndex -2 ) + ", " + secondPreIndex );

		
	}

}
