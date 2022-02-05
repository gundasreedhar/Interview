package com.algorithm.design.decorater;

public class SportsCar extends DecoratedCar {

	public SportsCar(Car car) {
		super(car);
	}

	
    public void assemble(){
    	super.assemble();
    	System.out.println("Sports car features added !! ");
    }
}
