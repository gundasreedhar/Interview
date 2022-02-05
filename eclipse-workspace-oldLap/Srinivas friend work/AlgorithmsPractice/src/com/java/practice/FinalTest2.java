package com.java.practice;

public class FinalTest2 {

}

class Holder<T> {
	private T[] contents;
	private int index = 0;

	public Holder(int size) {
		// contents = new T[size]; //compiler error - generic array creation
		contents = (T[]) new Object[size]; // workaround - casting Object[] to
											// generic Type
	}

	public void add(T content) {
		contents[index] = content;
	}

	public T get(int index) {
		return contents[index];
	}
}
