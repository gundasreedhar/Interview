package com.algorithm.design.strategy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FilterStrategyTest {
	public static void main(String[] args) {
		List<Message> messages = new ArrayList<>();
		messages.add(new Message(MessageType.TEXT, 30, "Text Data 1"));
		messages.add(new Message(MessageType.TEXT, 60, "Text Data 2"));
		messages.add(new Message(MessageType.TEXT, 30, "Text Data 3"));

		filter(messages, new FilterByType(MessageType.TEXT));
		filter(messages, new FilterByLength(50));
	}

	private static void filter(List<Message> messages, FilterStrategy filterStrategy) {

		Iterator<Message> iterator = messages.iterator();
		while (iterator.hasNext()) {
			Message message = iterator.next();
			if (filterStrategy.filter(message)) {
				System.out.println(filterStrategy + " " + message);

			}

		}
	}

}
