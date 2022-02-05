package com.dice.beans;

public enum DiceType {

	Eigth(8), TEN(10), TWELVE(12), TWENTY(20);
	int diceTypeNumber;

	DiceType(int diceTypeNumber) {
		this.diceTypeNumber = diceTypeNumber;
	}

	int getInt() {
		return diceTypeNumber;
	}

	public static DiceType getDiceType(int diceTypeNumber) {

		for (DiceType diceType : DiceType.values()) {
			if (diceType.getInt() == diceTypeNumber)
				return diceType;
		}
		return null;
	}

}
