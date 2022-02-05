
public class MaxNumberOfAUsingFourKeys {

	public static void main(String args[]) {

		int n = 11;
		System.out.println("Pressing key n number of times ::   " + n);
		int maxNumberOfAs = maxNumberOfAs(n);
		System.out.println("Number Of A's are " + maxNumberOfAs);

	}

	static int maxNumberOfAs(int n) {

		if (n <= 6)
			return n;

		int max = Integer.MIN_VALUE;
		for (int b = n - 3; b >= 1; b--) {

			int noOfAs = (n - b - 1) * maxNumberOfAs(b);
			max = Math.max(max, noOfAs);

		}

		return max;
	}
}
