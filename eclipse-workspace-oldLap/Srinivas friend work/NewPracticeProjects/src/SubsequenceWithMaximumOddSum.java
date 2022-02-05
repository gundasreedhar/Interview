
public class SubsequenceWithMaximumOddSum {

	public static void main(String[] args) {

		int arr[] = { 2, 5, -4, 3, -1 };

		int sum = findOddSubsequenceSum(arr);
		
		System.out.println("subsequence sum is " + sum);

	}

	private static int findOddSubsequenceSum(int arr[]) {

		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				sum = sum + arr[i];
			}

		}

		if (sum % 2 != 0) {
			return sum;
		} else {
			int minOdd = Integer.MIN_VALUE;
			for (int i = 0; i < arr.length; i++) {
				int data = Math.abs(arr[i]);
				int oddData = data % 2;
				if (oddData != 0) {
					if (oddData > minOdd) {
						minOdd = oddData;

					}

				}

			}

			if (minOdd != Integer.MIN_VALUE) {
				return (sum - minOdd);
			}
		}

		return -1;
	}
}
