package com.algorithm.design.strategy;

public class FilterByLength implements FilterStrategy {

	private int length;

	public FilterByLength(int length) {
		this.length = length;
	}

	@Override
	public boolean filter(Message message) {

		int lengthFromMessage = message.getLength();
		if (lengthFromMessage >= length)
			return true;

		return false;
	}

	@Override
	public String toString() {
		return " Filter By length : " + length;
	}
}
