package com.algorithm.design.decorater;

public class LuxuryCar extends DecoratedCar {

	public LuxuryCar(Car car) {
		super(car);
	}

	public void assemble() {
		super.assemble();
		System.out.println("Luxury Car features added !! ");
	}
}
