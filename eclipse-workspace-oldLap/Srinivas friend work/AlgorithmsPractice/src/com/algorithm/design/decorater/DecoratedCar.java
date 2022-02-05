package com.algorithm.design.decorater;

public class DecoratedCar extends BasicCar {

	private Car car;

	public DecoratedCar(Car car) {
		this.car = car;
	}

	public void assemble() {
		this.car.assemble();
	}
}
