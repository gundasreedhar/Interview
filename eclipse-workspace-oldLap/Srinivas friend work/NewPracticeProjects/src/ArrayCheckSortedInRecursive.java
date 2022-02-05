
public class ArrayCheckSortedInRecursive {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
		boolean check = checkSortedInRecursive(arr, arr.length-1);
		
		System.out.println("Is Recursive " +  check);
	}

	private static boolean checkSortedInRecursive(int[] arr, int n) {
		if (n == 0) {
			return true;
		}
		if (arr[n - 1] > arr[n]) {
			return false;
		}

		return checkSortedInRecursive(arr, n - 1);
	}

}
