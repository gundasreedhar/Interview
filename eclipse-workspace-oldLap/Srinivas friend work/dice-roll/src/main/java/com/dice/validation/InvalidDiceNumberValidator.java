package com.dice.validation;

public class InvalidDiceNumberValidator extends DiceValidator<String> {

	@Override
	public boolean validate(String expression) {
		String[] diceData = expression.split("[-+*/]");
		for (String eachDiceData : diceData) {
			String[] diceDetails = eachDiceData.split("[dD]");
			String n = diceDetails[0].trim();
			int intN = -1;
			try {
				intN = Integer.parseInt(n);
			} catch (NumberFormatException e) {
				return false;
			}
			if (intN <= 0) {
				return false;
			}
		}
		return getNextValidator().validate(expression);
	}

}
