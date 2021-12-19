package SrinivasPrograms;

import java.util.ArrayList;
import java.util.List;

public class LengthofSubArray {

	public static void main(String[] args) {
		String test = ".A..A..B.....B...C...C";
		List<Integer> res = getListOfStrings(test);
		System.out.println("res is " + res);
	}

	private static List<Integer> getListOfStrings(String test) {
		int start = -1;
		int i = 0;
		int count = 0;
		int length = test.length();
		List<Integer> resList = new ArrayList<>();
		while (i < length) {
			if (start < 0 && test.charAt(i) != '.') {
				start = i;
				count++;
			} else if (start > 0 && test.charAt(i) == test.charAt(start)) {
				count++;
				resList.add(count);
				count = 0;
				start = -1;
			} else if (start > 0 && test.charAt(i) == '.') {
				count++;
			} else if (start > 0 && test.charAt(i) != test.charAt(i)) {
				count = 0;
				start = -1;
			}
			i++;
		}
		return resList;
	}
}
