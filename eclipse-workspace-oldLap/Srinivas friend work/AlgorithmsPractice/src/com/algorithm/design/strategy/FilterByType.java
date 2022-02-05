package com.algorithm.design.strategy;

public class FilterByType implements FilterStrategy {
	private MessageType type;

	public FilterByType(MessageType type) {
		this.type = type;
	}

	@Override
	public boolean filter(Message message) {

		return type.equals(message.getType());
	}

	@Override
    public String toString() {
    return "Filter By Type : " + type;
    }

}
