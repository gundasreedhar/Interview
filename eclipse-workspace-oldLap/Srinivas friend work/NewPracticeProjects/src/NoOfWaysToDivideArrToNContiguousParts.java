import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NoOfWaysToDivideArrToNContiguousParts {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 0, 3 };

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		int numberOfWays = findWays(arr, x);

		System.out.println("Number Of Ways : " + numberOfWays);

	}

	private static int findWays(int[] arr, int x) {

		int numberOfWays = 0;
		int n = arr.length;
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}

		int partitionedSum = sum / x;
		if (partitionedSum == 0)
			return 0;

		int prefixArr[] = new int[arr.length];
		prefixArr[0] = arr[0];
		for (int i = 1; i < arr.length; i++) {
			prefixArr[i] = prefixArr[i - 1] + arr[i];

		}

		int suffix[] = new int[arr.length];
		suffix[n - 1] = arr[n - 1];
		for (int i = n - 2; i >= 0; i--) {
			suffix[n - 2] = suffix[n - 1] + arr[n - 2];
		}

		List<Integer> suffixSumList = new ArrayList<>();
		for (int i = 0; i < suffix.length; i++) {
			if (suffix[i] == partitionedSum) {
				suffixSumList.add(i);
			}
		}

		int count = 0;
		for (int i = 0; i < prefixArr.length; i++) {
			if (prefixArr[i] == partitionedSum) {
				
				int res = binarySearchInSuffixListSumArr(suffixSumList, i + x-2);

				if (res != -1)
					count = count + suffixSumList.size() - res;
			}

		}

		numberOfWays = count;

		return numberOfWays;

	}

	private static int binarySearchInSuffixListSumArr(List<Integer> suffixSumList, int x) {

		int low = 0;
		int high = suffixSumList.size() - 1;

		while (low <= high) {
			int mid = (low + high) / 2;

			if (suffixSumList.get(mid) <= x) {
				low = mid + 1;
			} else if (suffixSumList.get(mid) > x) {
				high = mid - 1;
			}

		}
		return low;
	}

}
