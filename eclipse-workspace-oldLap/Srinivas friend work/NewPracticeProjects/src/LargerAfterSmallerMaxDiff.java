public class LargerAfterSmallerMaxDiff {

	public static void main(String args[]) {

		int arr[] = { 2, 3, 10, 6, 4, 8, 1 };
		int maxDiff = getMaxDiffWithMethod1(arr);
		System.out.println("Max diff by method 1 is  " + maxDiff);

		int maxDiff2 = getMaxDiffWithMethod2(arr);
		System.out.println("Max diff by method 2 is " + maxDiff2);

		int maxDiff3 = getMaxDiffWithMethod3(arr);
		System.out.println("Max diff by method 3 is " + maxDiff3);

	}

	private static int getMaxDiffWithMethod1(int arr[]) {

		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int diff = arr[j] - arr[i];
				max = Math.max(max, diff);

			}

		}

		return max;
	}

	private static int getMaxDiffWithMethod2(int arr[]) {

		int maxDiff = arr[1] - arr[0];
		int min_ele = arr[0];
		for (int i = 1; i < arr.length; i++) {

			if ((arr[i] - min_ele) > maxDiff)
				maxDiff = arr[i] - min_ele;
			if (arr[i] < min_ele)
				min_ele = arr[i];

		}

		return maxDiff;

	}

	private static int getMaxDiffWithMethod3(int arr[]) {

		int len = arr.length;
		int diffArr[] = new int[len - 1];
		for (int i = 0; i < len - 1; i++) {
			diffArr[i] = arr[i + 1] - arr[i];
		}

		int max_Diff = diffArr[0];
		for (int i = 1; i < diffArr.length; i++) {
			if (diffArr[i - 1] > 0) {
				diffArr[i] = diffArr[i] + diffArr[i - 1];
			}
			if (max_Diff < diffArr[i]) {
				max_Diff = diffArr[i];
			}

		}

		return max_Diff;

	}

}