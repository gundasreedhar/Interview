package com.dice.roll;

public class TestValidation {

	public static void main(String[] args) {

		String data = "0D8 + 3D10 - 2D12";

		DiceValidator<String> validator = DiceValidationInitiater.linkDiceValidator();
		DiceComputer diceComputer = new DiceComputer();
		Expression expression = new Expression(data, diceComputer);
		boolean isValid = expression.isValid(validator);

		if (isValid) {
			expression.computeExpression();
			int minimum = expression.getMinimum();
			int maximum = expression.getMaximum();
		}
	}

}
