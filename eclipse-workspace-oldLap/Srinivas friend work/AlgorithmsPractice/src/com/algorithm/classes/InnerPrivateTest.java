package com.algorithm.classes;

public class InnerPrivateTest {

	public static void main(String[] args) {
		Outer_Demo outer_Demo = new Outer_Demo();
		outer_Demo.display_Outer();

	}

}

class Outer_Demo {
	int num;

	private class Inner_Demo {
		public void display_Inner() {
			System.out.println("Inner function !! ");
		}
	}

	public void display_Outer() {
		Inner_Demo inner_Demo = new Inner_Demo();
		inner_Demo.display_Inner();
	}
}