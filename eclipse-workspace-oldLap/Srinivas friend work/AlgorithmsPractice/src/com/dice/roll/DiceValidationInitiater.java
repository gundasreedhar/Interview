package com.dice.roll;

public class DiceValidationInitiater {

	public static DiceValidator<String> linkDiceValidator() {
		DiceValidator<String> spaceDiceValidator = new SpaceDiceValidator();
		DiceValidator<String> invalidDiceNumberValidator = new InvalidDiceNumberValidator();
		DiceValidator<String> invalidDiceSizeValidator = new InvalidDiceSizeValidator();
		TerminateDiceNumberValidator terminateDiceNumberValidator = new TerminateDiceNumberValidator();

		spaceDiceValidator.setNextValidator(invalidDiceNumberValidator);
		invalidDiceNumberValidator.setNextValidator(invalidDiceSizeValidator);
		invalidDiceSizeValidator.setNextValidator(terminateDiceNumberValidator);
		return spaceDiceValidator;
	}

	public static DiceType[] loadSupportedDices() {
		return DiceType.values();
	}
}
