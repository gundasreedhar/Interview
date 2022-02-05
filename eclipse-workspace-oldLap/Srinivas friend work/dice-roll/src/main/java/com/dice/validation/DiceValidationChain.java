package com.dice.validation;

public class DiceValidationChain {

	public static DiceValidator<String> chainDiceValidators() {
		DiceValidator<String> spaceDiceValidator = new SpaceDiceValidator();
		DiceValidator<String> invalidDiceNumberValidator = new InvalidDiceNumberValidator();
		DiceValidator<String> invalidDiceSizeValidator = new InvalidDiceSizeValidator();
		TerminateDiceNumberValidator terminateDiceNumberValidator = new TerminateDiceNumberValidator();

		spaceDiceValidator.setNextValidator(invalidDiceNumberValidator);
		invalidDiceNumberValidator.setNextValidator(invalidDiceSizeValidator);
		invalidDiceSizeValidator.setNextValidator(terminateDiceNumberValidator);
		return spaceDiceValidator;
	}

}
