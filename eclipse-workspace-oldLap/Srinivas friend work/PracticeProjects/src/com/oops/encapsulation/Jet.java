package com.oops.encapsulation;

public class Jet extends Airplane {
	private int FACTOR_MULTIPLIER = 2;



	@Override
	public void setSpeed(int speed) {
		// TODO Auto-generated method stub
		super.setSpeed(FACTOR_MULTIPLIER * speed);
	}

}
