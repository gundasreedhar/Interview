package com.dice.roll;

public class DiceDetails {
	private int noOfDices;
	private DiceType diceType;

	public int computeMinimum() {
		return noOfDices * 1;
	}

	public int computeMaximum() {
		return noOfDices * (diceType.getInt());
	}

	public int getNoOfDices() {
		return noOfDices;
	}

	public void setNoOfDices(int noOfDices) {
		this.noOfDices = noOfDices;
	}

	public DiceType getDiceType() {
		return diceType;
	}

	public void setDiceType(DiceType diceType) {
		this.diceType = diceType;
	}

}
