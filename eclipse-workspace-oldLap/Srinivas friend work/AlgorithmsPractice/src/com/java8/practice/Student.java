package com.java8.practice;

import java.util.HashSet;
import java.util.Set;

public class Student {

	private String name;
	private Set<String> books;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<String> getBook() {
		return books;
	}

	public void addBook(String book) {
		if (books == null) {
			books = new HashSet<>();
		}

		books.add(book);

	}
}
