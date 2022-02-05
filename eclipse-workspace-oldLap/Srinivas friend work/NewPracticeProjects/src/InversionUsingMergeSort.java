
public class InversionUsingMergeSort {

	public static void main(String[] args) {
		int arr[] = { 1, 16, 7, 8, 4 };

		int low = 0;
		int high = arr.length - 1;
		int temp[] = new int[arr.length];
		int invCount = mergeSort(arr, temp, low, high);

		System.out.println("InvCount is " + invCount);

	}

	private static int mergeSort(int[] arr, int[] temp, int low, int high) {

		int invCount = 0;
		if (low < high) {

			int mid = (low + high) / 2;
			invCount = mergeSort(arr, temp, low, mid);
			invCount += mergeSort(arr, temp, mid + 1, high);
			invCount += merge(arr, temp, low, mid + 1, high);

		}
		return invCount;
	}

	private static int merge(int[] arr, int[] temp, int low, int mid, int high) {

		int left = low;
		int i = low;
		int j = mid;
		int k = low;
		int right = high;
		int invCount = 0;
		while (i <= mid - 1 && j <= right) {
			if (arr[i] <= arr[j]) {
				temp[k++] = arr[i++];
			} else {
				temp[k++] = arr[j++];
				invCount = invCount + (mid - i);
			}
		}

		if (i <= mid - 1) {
			temp[k++] = arr[i++];
		}

		else if (j <= right) {
			temp[k++] = arr[j++];
		}

		for (int m = left; m <= right; m++) {
			arr[m] = temp[m];
		}

		return invCount;

	}

}
