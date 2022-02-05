import java.util.Scanner;

public class MaximumSumWithoutOverlap {

	public static void main(String[] args) {

		int arr[] = { 2, 5, 1, 2, 7, 3, 0 };

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter non overlap size ");
		int k = sc.nextInt();

		findMaximum(arr, k);

	}

	private static void findMaximum(int[] arr, int k) {

		int sum[] = preparePreSumArr(arr);

		int n = arr.length;

		int first = n - 2 * k;
		int second = n - k;

		int maximum = findSumSubArray(sum, first, n - k - 1) + findSumSubArray(sum, second, n - 1);

		int secondVal = findSumSubArray(sum, second, n - 1);
		int secondIndex = second;
		CustomObject secondObject = new CustomObject();
		secondObject.setIndex(secondIndex);
		secondObject.setValue(secondVal);

		ResultObject resultObject = new ResultObject();
		resultObject.setIndex1(first);
		resultObject.setIndex2(secondIndex);

		for (int i = n - 2 * k - 1; i >= 0; i--) {

			int kthIndexFromI = i + k;
			int cur = findSumSubArray(sum, kthIndexFromI, i + 2 * k - 1);

			if (cur >= secondObject.getValue()) {
				secondObject.setIndex(kthIndexFromI);
				secondObject.setValue(cur);
			}

			cur = findSumSubArray(sum, i, i + k - 1) + secondObject.getValue();

			if (cur >= maximum) {
				maximum = cur;
				resultObject.setIndex1(i);
				resultObject.setIndex2(secondObject.getIndex());
			}

		}

		System.out.println("Max pairs are : ");
		System.out.println(" [" + arr[resultObject.getIndex1()] + " " + arr[(resultObject.getIndex1() + k-1)] + " ]");
		System.out.println(" [" + arr[resultObject.getIndex2()] + " " + arr[(resultObject.getIndex2() + k-1)] + " ]");
	}

	private static int[] preparePreSumArr(int[] arr) {
		int sum[] = new int[arr.length];
		sum[0] = arr[0];
		for (int i = 1; i < arr.length; i++) {
			sum[i] = sum[i - 1] + arr[i];
		}
		return sum;
	}

	private static int findSumSubArray(int sum[], int i, int j) {

		if (i == 0)
			return sum[j];
		return sum[j] - sum[i - 1];

	}
}

class CustomObject {
	private int index;
	private int value;

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

}

class ResultObject {
	private int index1;
	private int index2;

	public int getIndex1() {
		return index1;
	}

	public void setIndex1(int index1) {
		this.index1 = index1;
	}

	public int getIndex2() {
		return index2;
	}

	public void setIndex2(int index2) {
		this.index2 = index2;
	}

}