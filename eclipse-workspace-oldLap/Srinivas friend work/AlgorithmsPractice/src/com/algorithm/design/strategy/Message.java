package com.algorithm.design.strategy;

public class Message {
	private MessageType type;
	private int length;
	private String content;

	public Message(MessageType type, int length, String content) {
		this.type = type;
		this.length = length;
		this.content = content;
	}

	@Override
	public String toString() {
		return " Type is : " + type + " , length is " + length + " , content is " + content;
	}

	public MessageType getType() {
		return type;
	}

	public int getLength() {
		return length;
	}

	public String getContent() {
		return content;
	}

}
