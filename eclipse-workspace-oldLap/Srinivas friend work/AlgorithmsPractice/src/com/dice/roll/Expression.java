package com.dice.roll;

import java.util.List;

public class Expression {
	private String expression;
	private boolean isValid;
	private DiceBuilder diceBuilder;
	private int minimum;
	private int maximum;
	private DiceComputer diceComputer;

	public int getMinimum() {
		return minimum;
	}

	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}

	public int getMaximum() {
		return maximum;
	}

	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}

	public Expression(String expression, DiceComputer diceComputer, DiceBuilder diceBuilder) {
		this.expression = expression;
		this.diceComputer = diceComputer;
		this.diceBuilder = diceBuilder;

	}

	public boolean isValid(DiceValidator<String> validator) {
		isValid = validator.validate(expression);
		return isValid;
	}

	public void computeExpression() {
		List<DiceDetails> diceDetails = diceBuilder.buildDiceDetails();
		List<Operator> operators = diceBuilder.buildDiceOperators();
		diceComputer.computeDices(diceDetails,operators);
	}

}
