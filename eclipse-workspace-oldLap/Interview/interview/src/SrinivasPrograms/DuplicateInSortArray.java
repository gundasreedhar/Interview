package SrinivasPrograms;

class RemoveDuplicateInSortedArray_back {
	public static int[] removeDuplicates(int[] input) {
		int j = 0;
		int i = 1;
		// return if the array length is less than 2
		if (input.length < 2) {
			return input;
		}
		while (i < input.length) {
			if (input[i] == input[j]) {
				i++;
			} else {
				input[++j] = input[i++];
			}
		}
		int[] output = new int[j + 1];
		for (int k = 0; k < output.length; k++) {
			output[k] = input[k];
		}
		return output;
	}

	public static void main(String a[]) {
		int[] input1 = { 2, 3, 6, 6, 8, 9, 10, 10, 10, 12, 12 };
		int[] output = removeDuplicates(input1);
		for (int i : output) {
			System.out.print(i + " ");
		}
	}
}

public class DuplicateInSortArray {
	public static void main(String a[]) {
		int[] arr = { 2, 3, 6, 6, 8, 9, 10, 10, 10, 12, 12 };
		int j = removeDuplicates(arr);
		for (int i = 0; i < j; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	private static int removeDuplicates(int[] arr) {
		int j = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				arr[j] = arr[i];
				j++;
			}
		}
		arr[j++] = arr[arr.length - 1];
		return j;
	}
}
