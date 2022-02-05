package com.algorithm.classes;

public class AnonymousInnerClassTest {

	public static void main(String[] args) {

		AnonymousInner inner = new AnonymousInner() {

			@Override
			public void myMethod() {
				System.out.println("This is an example of anonymous inner class");
			}
		};

		inner.myMethod();
	}

}

abstract class AnonymousInner {
	public abstract void myMethod();
}
