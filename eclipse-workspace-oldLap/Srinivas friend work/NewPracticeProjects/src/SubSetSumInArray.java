
public class SubSetSumInArray {

	public static void main(String args[]) {
		int arr[] = { 1, 11, 0, 10 };
		int n = arr.length;
		int sum = 8;
		boolean isSubSetSumPresent = findIfSubSetSumIsThere(arr, n, sum);
		System.out.println("SubSet Sum present : " + isSubSetSumPresent);
	}

	private static boolean findIfSubSetSumIsThere(int[] arr, int n, int sum) {

		if (sum == 0)
			return true;
		else if (sum != 0 && n == 0) {
			return false;
		}

		return findIfSubSetSumIsThere(arr, n - 1, sum) || findIfSubSetSumIsThere(arr, n - 1, sum - arr[n - 1]);
	}

}
