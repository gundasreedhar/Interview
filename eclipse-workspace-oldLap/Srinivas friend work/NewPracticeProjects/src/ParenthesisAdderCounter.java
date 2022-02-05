import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParenthesisAdderCounter {

	public static void main(String[] args) {

		String input = "5*4-3*2";
		List<Integer> res = possibleResult(input);

		for (int i = 0; i < res.size(); i++) { // cout << res[i] << " ";
			System.out.println(res.get(i) + " ");
		}

	}

	static boolean isOperator(char op) {
		return (op == '+' || op == '-' || op == '*');
	}

	static List<Integer> possibleResult(String input) {
		Map<String, List<Integer>> memo = new HashMap<>();
		return possibleResultUtil(input, memo);
	}

	// Utility recursive method to get all possible
	// result of input string
	static List<Integer> possibleResultUtil(String input, Map<String, List<Integer>> memo) {
		// If already calculated, then return from memo
		if (memo.get(input) != null && memo.get(input).size() > 0)
			return memo.get(input);
		List<Integer> res = new ArrayList<>();

		for (int i = 0; i < input.length(); i++) {
			if (isOperator(input.charAt(i))) {
				// If character is operator then split and
				// calculate recursively
				List<Integer> resPre = possibleResultUtil(input.substring(0, i), memo);
				List<Integer> resSuf = possibleResultUtil(input.substring(i + 1), memo);

				// Combine all possible combination
				for (int j = 0; j < resPre.size(); j++) {
					for (int k = 0; k < resSuf.size(); k++) {
						if (input.charAt(i) == '+')
							res.add(resPre.get(j) + resSuf.get(k));
						else if (input.charAt(i) == '-')
							res.add(resPre.get(j) - resPre.get(k));
						else if (input.charAt(i) == '*')
							res.add(resPre.get(j) * resPre.get(k));
					}
				}
			}
		}

		// if input contains only number then save that
		// into res vector
		if (res.size() == 0) {
			int g = Character.getNumericValue(input.charAt(0));
			res.add(g);
		}

		// Store in memo so that input string is not
		// processed repeatedly

		memo.put(input, res);
		return res;
	}

}
