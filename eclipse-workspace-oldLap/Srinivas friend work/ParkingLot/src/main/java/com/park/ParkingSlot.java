package com.park;

public class ParkingSlot {

	private int slotNumber;
	private Vehicle vehicle;
	boolean isParked;



	ParkingSlot(Vehicle vehicle, int slotNumber) {
		this.vehicle = vehicle;
		this.isParked = true;
		this.slotNumber = slotNumber;
	}

	public void unpark() {
		this.isParked = false;
	}

	public int getSlotNumber() {
		return slotNumber;
	}

	public void setSlotNumber(int slotNumber) {
		this.slotNumber = slotNumber;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
	public boolean isParked() {
		return isParked;
	}

	public void setParked(boolean isParked) {
		this.isParked = isParked;
	}

}
