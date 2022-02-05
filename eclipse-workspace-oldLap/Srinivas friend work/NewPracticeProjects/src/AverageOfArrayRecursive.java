
public class AverageOfArrayRecursive {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5 };
		int average = findAvgArrayRecur(arr, 0, arr.length);
		
		System.out.println("Average is " + average);
	}

	private static int findAvgArrayRecur(int[] arr, int i, int n) {

		if (i == n - 1)
			return arr[i];

		if (i == 0) {
			return (arr[i] + findAvgArrayRecur(arr, i + 1, n)) / n;
		}

		return arr[i] + findAvgArrayRecur(arr, i + 1, n);

	}

}
