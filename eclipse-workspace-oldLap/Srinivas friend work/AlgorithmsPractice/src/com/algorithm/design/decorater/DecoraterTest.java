package com.algorithm.design.decorater;

public class DecoraterTest {

	public static void main(String[] args) {

		Car sportsCar = new SportsCar(new BasicCar());
		Car luxuryCar = new LuxuryCar(new BasicCar());
		sportsCar.assemble();
		luxuryCar.assemble();

	}

}
