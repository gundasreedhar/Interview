package com.algorithm.classes;

public class MethodLocalInnerClass {

	public static void main(String[] args) {
		Outer_Demo2 outer_Demo2 = new Outer_Demo2();
		outer_Demo2.myMethod();
	}
}

class Outer_Demo2 {

	public void myMethod() {
		int num = 2;
		class Inner_Demo2 {

			void getValue() {
				System.out.println("Getting data " + num);
			}

		}

		Inner_Demo2 inner_Demo2 = new Inner_Demo2();
		inner_Demo2.getValue();
	}

}