package com.dice.validation;

public abstract class DiceValidator<T> {
	private DiceValidator<T> nextValidator;
	private T data;

	public abstract boolean validate(T data);

	public DiceValidator<T> getNextValidator() {
		return nextValidator;
	}

	public void setNextValidator(DiceValidator<T> nextValidator) {
		this.nextValidator = nextValidator;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}
