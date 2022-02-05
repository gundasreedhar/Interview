package com.dice.module;

import java.util.ArrayList;
import java.util.List;

import com.dice.beans.DiceDetails;
import com.dice.beans.DiceType;
import com.dice.beans.Operator;

public class DiceBuilder {

	private final String OPERATOR_REGEX = "[-+*/]";
	private final String MATCHER = "[dD]";
	private String expression;

	DiceBuilder(String expression) {
		this.expression = expression;
	}

	public List<Operator> buildDiceOperators() {
		List<Operator> operators = new ArrayList<Operator>();
		for (int i = 0; i < expression.length(); i++) {
			switch (expression.charAt(i)) {
			case '+':
				operators.add(Operator.PLUS);
				break;
			case '-':
				operators.add(Operator.MINUS);
			}
		}
		return operators;
	}

	public List<DiceDetails> buildDiceDetails() {
		List<DiceDetails> diceDetails = new ArrayList<DiceDetails>();
		String[] diceElements = expression.split(OPERATOR_REGEX);
		for (String eachDiceElement : diceElements) {
			String diceDetail = eachDiceElement.trim();
			String[] splitOnD = diceDetail.split(MATCHER);
			String numberOfDices = splitOnD[0];
			int intNumberOfDices = Integer.parseInt(numberOfDices);
			String numberOfSidesPerDice = splitOnD[1];
			int intNumberOfSidesPerDice = Integer.parseInt(numberOfSidesPerDice);
			DiceDetails diceDetailObject = new DiceDetails();
			diceDetailObject.setNoOfDices(intNumberOfDices);
			diceDetailObject.setDiceType(DiceType.getDiceType(intNumberOfSidesPerDice));
			diceDetails.add(diceDetailObject);

		}

		return diceDetails;
	}

}
