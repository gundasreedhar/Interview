package com.dice.roll;

import java.util.List;

public class DiceComputer {
	private Expression expression;

	public DiceComputer(Expression expression) {
		this.expression = expression;
	}

	public void computeDices(List<DiceDetails> diceDetails, List<Operator> operators) {

		int minimum = 0;
		int maximum = 0;
		int operatorIndex = -1;

		for (DiceDetails diceDetail : diceDetails) {

			if (operatorIndex < 0) {
				minimum = diceDetail.computeMinimum();
				maximum = diceDetail.computeMaximum();
				operatorIndex++;
				continue;
			}

			Operator operator = operators.get(operatorIndex);
			switch (operator) {
			case PLUS:
				minimum = minimum + diceDetail.computeMinimum();
				maximum = maximum + diceDetail.computeMaximum();
				break;

			case MINUS:
				minimum = minimum - diceDetail.computeMinimum();
				maximum = maximum - diceDetail.computeMaximum();

			default:
				break;
			}
			operatorIndex++;

		}

		expression.setMinimum(minimum);
		expression.setMaximum(maximum);

	}

}
