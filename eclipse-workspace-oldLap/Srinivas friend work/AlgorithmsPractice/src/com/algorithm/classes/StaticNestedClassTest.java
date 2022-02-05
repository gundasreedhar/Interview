package com.algorithm.classes;

public class StaticNestedClassTest {

	public static void main(String[] args) {
		Outer.Inner outerInner = new Outer.Inner();
		outerInner.getData();
	}
}

class Outer {
	static class Inner {
		void getData() {
			System.out.println("Data called !! ");
		}
	}
}