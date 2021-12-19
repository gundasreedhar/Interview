public class InsertionSort {
	public static void main(String[] args) {
		int[] arr = { 2, 5, 3, 7, 6, 13, 12, 14, };
		for (int i = 0; i < arr.length; i++) {
			int j = i;
			while (j > 0) {
				if (arr[j - 1] > arr[j]) {
					int temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				} else {
					break;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
