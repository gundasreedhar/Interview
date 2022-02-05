package com.oops.encapsulation;

public class TestEncapsulation {

	public static void main(String[] args) {

		Jet jet1 = new Jet();
		jet1.speed = 2;
		System.out.println(jet1.getSpeed());

		Jet jet2 = new Jet();
		jet2.setSpeed(2);
		System.out.println(jet2.getSpeed());
	}
}
