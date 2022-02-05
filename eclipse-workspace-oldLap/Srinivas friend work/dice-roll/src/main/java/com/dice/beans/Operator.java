package com.dice.beans;

public enum Operator {

	PLUS("+"), MINUS("-");

	String operator;

	Operator(String operator) {
		this.operator = operator;
	}

	@Override
	public String toString() {
		return operator;
	}

}
