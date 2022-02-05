package com.dice.module;

import java.util.List;

import com.dice.beans.DiceDetails;
import com.dice.beans.MultiDiceThrowResult;
import com.dice.beans.Operator;
import com.dice.validation.DiceValidationChain;
import com.dice.validation.DiceValidator;

public class Expression {
	private String expression;
	private boolean isValid;
	private DiceBuilder diceBuilder;
	private DiceComputer diceComputer;
	private DiceValidator<String> validator;

	public Expression(String expression) {
		this.expression = expression;
		this.diceComputer = new DiceComputer();
		this.diceBuilder = new DiceBuilder(expression);
		this.validator = DiceValidationChain.chainDiceValidators();

	}

	public boolean isValid() {
		isValid = validator.validate(expression);
		return isValid;
	}

	public MultiDiceThrowResult computeExpression() {
		List<DiceDetails> diceDetails = diceBuilder.buildDiceDetails();
		List<Operator> operators = diceBuilder.buildDiceOperators();
		return diceComputer.computeDices(diceDetails, operators);

	}

}
