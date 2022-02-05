public class Permuter {

	public static void main(String args[]) {

		String sourceData = "ABC";
		permuter(sourceData, 0);
	}

	private static void permuter(String sourceData, int pos) {

		int len = sourceData.length();

		if (pos == len) {
			System.out.println(sourceData);
			return;
		}
		for (int i = pos; i <= len - 1; i++) {

			String newString = new String(sourceData);
			char[] charArr = newString.toCharArray();
			char temp = charArr[pos];
			charArr[pos] = charArr[i];
			charArr[i] = temp;
			newString = new String(charArr);

			permuter(newString, pos + 1);

		}

	}

}