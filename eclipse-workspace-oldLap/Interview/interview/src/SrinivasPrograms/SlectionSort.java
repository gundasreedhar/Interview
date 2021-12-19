

public class SlectionSort {
	public static void main(String args[]) {
		int arr[] = {  7, 2, 5, 1, 3 };
		sort(arr);
		System.out.println("Sorted array");
		printArray(arr);
	}

	private static void sort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				printArray(arr);
			}
		}
	}

	static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
}
