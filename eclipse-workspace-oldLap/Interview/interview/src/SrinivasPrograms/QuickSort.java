

import java.util.Arrays;

public class QuickSort {
	public static void main(String[] args) {
		int arr[] = { 10, 9, 8, 7, 6 };
		int high = arr.length - 1;
		int first = 0;
		QuickSort qs = new QuickSort();
		qs.sort(arr, first, high);
		System.out.println(Arrays.toString(arr));
	}

	public void sort(int[] arr, int low, int high) {
		if (low < high) {
			int pivot = arr[high];
			int i = (low - 1);
			for (int j = low; j < high; j++) {
				if (arr[j] < pivot) {
					i++;
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			int temp = arr[i + 1];
			arr[i + 1] = arr[high];
			arr[high] = temp;
			int pi = i + 1;
			sort(arr, low, pi - 1);
			sort(arr, pi + 1, high);
		}
	}
}
