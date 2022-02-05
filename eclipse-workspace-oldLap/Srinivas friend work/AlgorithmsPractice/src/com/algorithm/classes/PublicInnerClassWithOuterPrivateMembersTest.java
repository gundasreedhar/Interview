package com.algorithm.classes;

public class PublicInnerClassWithOuterPrivateMembersTest {

	public static void main(String[] args) {
		Outer_Demo1 outer_Demo1 = new Outer_Demo1();
		Outer_Demo1.Inner_Demo2 innerDemo2 = outer_Demo1.new Inner_Demo2();
		innerDemo2.getValue();
	}
}

class Outer_Demo1 {
	private int num;

	public class Inner_Demo2 {

		int getValue() {
			System.out.println("Inside inner method !! ");
			return num;
		}
	}

}