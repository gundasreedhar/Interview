import java.util.Arrays;

public class FindDuplicates {
	static int findduplicate(int[] arr, int n) {
		// return -1 because in these cases // there can not be any repeated element
		if (n <= 1)
			return -1;
		// initialize fast and slow
		int slow = arr[0];
		int fast = arr[arr[0]];

		// loop to enter in the cycle
		while (fast != slow) {
			// move one step for slow
			slow = arr[slow];
			// move two step for fast
			fast = arr[arr[fast]];
		}

		// loop to find entry // point of the cycle
		fast = 0;
		while (slow != fast) {
			slow = arr[slow];
			fast = arr[fast];
		}
		return slow;
	}

	public static void main(String args[]) {
		int[] arr = { 1, 2, 3, 4, 5, 12, 6, 3, 12 };
		int n = arr.length;
		System.out.print(findduplicate(arr, n));
	}
}

class FindDuplicatesABS {
	static void printRepeating(int arr[], int size) {
		System.out.println("The repeating elements are : ");
		for (int i = 0; i < size; i++) {
			if (arr[Math.abs(arr[i])] >= 0) {
				arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
				System.out.println(Arrays.toString(arr));
			} else
				System.out.print("Repeat ele are " + Math.abs(arr[i]) + " ");
		}
	}

	public static void main(String[] args) {
		int arr[] = { 4, 2, 4, 5, 2, 3, 1 };
		int arr_size = arr.length;
		printRepeating(arr, arr_size);
	}
}