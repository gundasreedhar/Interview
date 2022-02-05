package com.dice.module;

import java.util.List;

import com.dice.beans.DiceDetails;
import com.dice.beans.MultiDiceThrowResult;
import com.dice.beans.Operator;

public class DiceComputer {

	public MultiDiceThrowResult computeDices(List<DiceDetails> diceDetails, List<Operator> operators) {

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

		MultiDiceThrowResult diceThrowResult = new MultiDiceThrowResult();
		diceThrowResult.setMaximum(maximum);
		diceThrowResult.setMinimum(minimum);

		return diceThrowResult;
	}

}
