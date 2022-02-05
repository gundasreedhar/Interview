package com.dice.roll;

public class InvalidDiceSizeValidator extends DiceValidator<String> {

	@Override
	boolean validate(String expression) {
		String[] diceData = expression.split("[-+*/]");
		for (String eachDiceData : diceData) {
			String[] diceDetails = eachDiceData.split("[dD]");
			String s = diceDetails[1].trim();
			int intS = Integer.parseInt(s);
			DiceType diceType = DiceType.getDiceType(intS);
			if (diceType == null) {
				return false;
			}

		}
		return getNextValidator().validate(expression);
	}

}
