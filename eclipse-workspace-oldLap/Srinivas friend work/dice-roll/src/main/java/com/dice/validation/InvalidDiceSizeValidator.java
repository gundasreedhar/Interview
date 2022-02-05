package com.dice.validation;

import com.dice.beans.DiceType;

public class InvalidDiceSizeValidator extends DiceValidator<String> {

	@Override
	public boolean validate(String expression) {
		String[] diceData = expression.split("[-+*/]");
		for (String eachDiceData : diceData) {
			String[] diceDetails = eachDiceData.split("[dD]");
			String s = diceDetails[1].trim();
			if(s == null || s.isEmpty()){
				return false;
			}
			int intS = Integer.parseInt(s);
			DiceType diceType = DiceType.getDiceType(intS);
			if (diceType == null) {
				return false;
			}

		}
		return getNextValidator().validate(expression);
	}

}
