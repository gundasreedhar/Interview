package com.dice.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SpaceDiceValidator extends DiceValidator<String> {

	@Override
	public boolean validate(String expression) {
		
		if(expression == null) {
			return false;
		}
		
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
