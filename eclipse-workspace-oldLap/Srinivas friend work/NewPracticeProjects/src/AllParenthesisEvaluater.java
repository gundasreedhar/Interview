import java.util.*;

public class AllParenthesisEvaluater {

	public static void main(String args[]) {

		String testString = "5*4-3*2";
		Map<String, List<Integer>> map = new HashMap<String, List<Integer>>();
		allParenthesizer(testString, map);
		List<Integer> allParenthesizerSum = map.get(testString);
		System.out.println("Result is " + allParenthesizerSum);

	}

	private static List<Integer> allParenthesizer(String data, Map<String, List<Integer>> map) {

		List<Integer> result = new ArrayList<Integer>();

		for (int i = 0; i < data.length(); i++) {

			if (isOperater(data.charAt(i))) {

				List<Integer> resPrefixArr = allParenthesizer(data.substring(0, i), map);
				List<Integer> resSuffixArr = allParenthesizer(data.substring(i + 1), map);

				for (int k = 0; k < resPrefixArr.size(); k++) {
					for (int j = 0; j < resSuffixArr.size(); j++) {

						if (data.charAt(i) == '+') {
							result.add(resPrefixArr.get(k) + resSuffixArr.get(j));
						}

						else if (data.charAt(i) == '-') {
							result.add(resPrefixArr.get(k) - resSuffixArr.get(j));
						}

						else if (data.charAt(i) == '*') {
							result.add(resPrefixArr.get(k) * resSuffixArr.get(j));
						}
					}
				}

			}

		}

		if (result.size() == 0) {
			int intData = Character.getNumericValue(data.charAt(0));
			result.add(intData);
		}

		map.put(data, result);

		return result;

	}

	private static boolean isOperater(char charAt) {
		return charAt == '+' || charAt == '-' || charAt == '*';
	}

}