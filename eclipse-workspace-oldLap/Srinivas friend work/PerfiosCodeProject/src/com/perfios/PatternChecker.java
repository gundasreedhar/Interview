package com.perfios;

import static com.perfois.util.Constants.ASTRICK;
import static com.perfois.util.Constants.DOT;
import static com.perfois.util.Constants.FIRST_INDEX;
import static com.perfois.util.Constants.SECOND_INDEX;
import static com.perfois.util.Constants.ZERO_INDEX;

public class PatternChecker {

	public static void main(String[] args) {
		PatternChecker patternChecker = new PatternChecker();

		boolean check = patternChecker.check("aab", "c*a*b");

		System.out.println("ans is " + check);
	}

	public boolean check(String text, String pattern) {
		if (emptyTextString(pattern))
			return emptyTextString(text);
		boolean initialMatcher = (!emptyTextString(text)
				&& (firstCharacterMatching(text, pattern) || matchesDotCriteria(pattern)));

		if (astrickchecker(pattern)) {
			return (ignoreDataBeforeAstrick(text, pattern)
					|| (initialMatcher && checkWithInitialPattern(text, pattern)));
		} else {
			return initialMatcher && movingToNextChar(text, pattern);
		}
	}

	private boolean movingToNextChar(String text, String pattern) {
		return check(text.substring(FIRST_INDEX), pattern.substring(FIRST_INDEX));
	}

	private boolean checkWithInitialPattern(String text, String pattern) {
		return check(text.substring(FIRST_INDEX), pattern);
	}

	private boolean ignoreDataBeforeAstrick(String text, String pattern) {
		return check(text, pattern.substring(SECOND_INDEX));
	}

	private boolean astrickchecker(String pattern) {
		return pattern.length() >= 2 && pattern.charAt(FIRST_INDEX) == ASTRICK;
	}

	private boolean matchesDotCriteria(String pattern) {
		return pattern.charAt(ZERO_INDEX) == DOT;
	}

	private boolean firstCharacterMatching(String text, String pattern) {
		return pattern.charAt(ZERO_INDEX) == text.charAt(0);
	}

	private boolean emptyTextString(String text) {
		return text.isEmpty();
	}
}
