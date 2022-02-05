package com.dice.roll;

import java.util.ArrayList;
import java.util.List;

public class DiceBuilder {

	private String expression;

	DiceBuilder(String expression) {
		this.expression = expression;
	}

	public List<Operator> buildDiceOperators() {
		List<Operator> operators = new ArrayList<>();
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
		List<DiceDetails> diceDetails = new ArrayList<>();
		String[] diceElements = expression.split("[-+*/]");
		for (String eachDiceElement : diceElements) {
			String diceDetail = eachDiceElement.trim();
			String[] splitOnD = diceDetail.split("[dD]");
			String n = splitOnD[0];
			int intN = Integer.parseInt(n);
			String s = splitOnD[1];
			int intS = Integer.parseInt(s);
			DiceDetails diceDetailObject = new DiceDetails();
			diceDetailObject.setNoOfDices(intN);
			diceDetailObject.setDiceType(DiceType.getDiceType(intS));
			diceDetails.add(diceDetailObject);

		}

		return diceDetails;
	}
	
	

}
