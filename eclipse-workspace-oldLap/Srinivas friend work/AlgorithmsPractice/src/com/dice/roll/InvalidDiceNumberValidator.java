package com.dice.roll;

public class InvalidDiceNumberValidator extends DiceValidator<String> {

	@Override
	boolean validate(String expression) {
		String[] diceData = expression.split("[-+*/]");
		for (String eachDiceData : diceData) {
			String[] diceDetails = eachDiceData.split("[dD]");
			String n = diceDetails[0].trim();
			int intN = Integer.parseInt(n);
			if (intN <= 0) {
				return false;
			}
		}
		return getNextValidator().validate(expression);
	}

}
