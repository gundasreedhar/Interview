package SrinivasPrograms;



import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Permutation1 {
	public static void main(String args[]) {
		String input = "678";
		Set<String> set = new HashSet<>();
		permuter(input.toCharArray(), 0, input.length() - 1, set);
		System.out.println(set);
	}

	private static void permuter(char[] ary, int start, int end, Set<String> set) {
		if (start == end) {
			set.add(String.valueOf(ary));
		} else {
			for (int k = start; k <= end; k++) {
				swap(ary, start, k);
				permuter(ary, start + 1, end, set);
				swap(ary, start, k);
			}
		}
	}

	private static void swap(char[] ary, int i, int j) {
		char temp = ary[i];
		ary[i] = ary[j];
		ary[j] = temp;
	}
}

public class Permutation {
	static String input = "ABC";

	public static void main(String args[]) {
		permuter(input.toCharArray());
	}

	private static void permuter(char[] charArray) {
		int i = 0;
		do {
			int j = i + 1;
			if (i == input.length() - 1) {
				j = 0;
			} else if (i > input.length() - 1) {
				i = 0;
				j = i + 1;
			}
			swap(charArray, i, j);
			i++;
		} while (!Arrays.equals(input.toCharArray(), charArray));
	}

	private static void swap(char[] ary, int i, int j) {
		char temp = ary[i];
		ary[i] = ary[j];
		ary[j] = temp;
		System.out.println(String.valueOf(ary));
	}
}