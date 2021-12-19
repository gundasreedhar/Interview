package interview;

import java.util.ArrayList;
import java.util.List;

public class LengthOfSubString {

	public static void lengthOfSubString(String str) {
		List<Integer> list = new ArrayList<Integer>();
		int start = -1;
		int count = 0;
		for (int i = 0; i < str.length(); i++) {

			if (start < 0 && str.charAt(i) != '.') { // for new substring
				start = i;
				count++;
			} else if (start > 0 && str.charAt(i) == '.') { // in the start of new substring check for .
				count++;
			} else if (start > 0 && str.charAt(i) == str.charAt(start)) { // end of new substring when encounterd the
																			// same character
				count++;
				list.add(count);
				count = 0;
				start = -1;
			} else {// when encountered the unmatching start end of substring
				count = 1;
				start = i;
			}
		}

		System.out.println(list);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "B.A..A..B.....B...C...C";

		lengthOfSubString(test);
	}

}
