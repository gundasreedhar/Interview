public class MaxWeightTransformationOfString {

	public static void main(String args[]) {

		String str = "AAB";
		int n = str.length();
		int current = 0;
		int maxWeight = getMaximumWeight(str, n, current);
		System.out.println("Maximum Weight is  " + maxWeight);

	}

	static private int getMaximumWeight(String str, int n, int current) {

		int max = Integer.MIN_VALUE;
		if (n == 0)
			return 0;
		if (n == 1)
			return 1;

		if (str.charAt(0) != str.charAt(1)) {

			max = Math.max(1 + getMaximumWeight(str.substring(current + 1, n), n - 1, current),
					4 + getMaximumWeight(str.substring(current + 2, n), n - 2, current));

		}

		else {
			max = Math.max(1 + getMaximumWeight(str.substring(current + 1, n), n - 1, current),
					3 + getMaximumWeight(str.substring(current + 2, n), n - 2, current));
		}

		return max;

	}

}