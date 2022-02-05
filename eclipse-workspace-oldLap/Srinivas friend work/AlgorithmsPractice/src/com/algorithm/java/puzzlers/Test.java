package com.algorithm.java.puzzlers;

public class Test {

	public static void main(String[] args) {

		System.out.println(abc());
	}

	static String abc() {

		System.out.println("I am here ");
		return null;
	}

	void def() {

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}

 class Test1 extends Test {

	@Override
	void def() {
		// TODO Auto-generated method stub
		super.def();
	}

	//Wrong we cannot have static invocation of parent method which is non static 
	/*static void def() {
		// TODO Auto-generated method stub
		super.def();
	}*/
}
