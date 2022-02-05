public class StringSubsequencesDivisibleByM {

	public static void main(String args[]) {
		String data = "1234";
		int index = 0;
		int n = data.length();
		int rem = 0;
		int m = 4;
		int subSequencesDivisible = subSequenceDivisible(data, index, n, rem, m);
		System.out.println("Number of string subsequences " + subSequencesDivisible);
	}

	private static int subSequenceDivisible(String data, int index, int n, int rem, int m) {

		if (index == n) {
				return rem == 0 ? 1 : 0;
		}

		int ans = 0;
		ans = ans + subSequenceDivisible(data, index + 1, n, rem, m);
		char ch = data.charAt(index);
		int value = Character.getNumericValue(ch);
		ans = ans + subSequenceDivisible(data, index + 1, n, (rem * 10 + value) % m, m);

		return ans;

	}
}