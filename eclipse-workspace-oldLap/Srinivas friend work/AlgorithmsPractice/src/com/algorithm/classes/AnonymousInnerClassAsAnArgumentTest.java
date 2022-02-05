package com.algorithm.classes;

public class AnonymousInnerClassAsAnArgumentTest {

	public static void main(String[] args) {
		AnonymousInnerClassAsAnArgumentTest anArgumentTest = new AnonymousInnerClassAsAnArgumentTest();
		anArgumentTest.getMessageDetails(new Message() {

			@Override
			public void getMessage() {
				System.out.println("Message got ");
			}
		});

	}

	void getMessageDetails(Message message) {
		System.out.println("Final Message .. ");
		message.getMessage();

	}
}

interface Message {
	void getMessage();
}