
public class CountWaysToJump {

	public static void main(String[] args) {

		int srcArr[] = { 1, 3, 5, 8, 9, 1, 0, 7, 6, 8, 9 };
		int resultArr[] = new int[srcArr.length];

		for (int i = 0; i < srcArr.length; i++) {
			resultArr[i] = -1;
		}
		findWaysToJump(srcArr, resultArr, 0);

		System.out.println("resultArr is " + resultArr);
	}

	private static int findWaysToJump(int[] srcArr, int[] resultArr, int start) {

		if (start == srcArr.length - 1) {
			resultArr[start] = 1;
			return 1;
		}

		if (resultArr[start] != -1)
			return resultArr[start];

		int end = start + srcArr[start];

		if (end >= srcArr.length - 1) {
			end = srcArr.length - 1;
		}
		int sum = 0;
		for (int i = start; i < end; i++) {

			sum = sum + findWaysToJump(srcArr, resultArr, i + 1);

		}

		resultArr[start] = sum;

		return sum;
	}
}
