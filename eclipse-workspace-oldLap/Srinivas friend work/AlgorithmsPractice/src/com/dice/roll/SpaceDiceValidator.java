package com.dice.roll;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SpaceDiceValidator extends DiceValidator<String> {

	@Override
	boolean validate(String expression) {

		String[] diceData = expression.split("[-+*/]");
		for (String eachDiceData : diceData) {
			Pattern pattern = Pattern.compile("\\s");
			eachDiceData = eachDiceData.trim();
			Matcher matcher = pattern.matcher(eachDiceData);
			boolean isWhitespace = matcher.find();
			if (isWhitespace) {
				return false;
			}
		}

		return getNextValidator().validate(expression);

	}

}
