package com.park;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParkingLot {

	List<ParkingSlot> parkingSlots;
	int MAX_SIZE_SLOTS;
	int slotNumber;
	Map<String, List<Vehicle>> colourBasedVehiclesMapper;
	Map<String, Integer> registrationNumberToSlotNumber;

	public ParkingLot(int slots) {
		// parkingSlots = new ArrayList<ParkingSlot>(slots);
		this.MAX_SIZE_SLOTS = slots;
		parkingSlots = new ArrayList<ParkingSlot>();
		colourBasedVehiclesMapper = new HashMap<String, List<Vehicle>>();
		registrationNumberToSlotNumber = new HashMap<String, Integer>();
	}

	void park(Vehicle vehicle) throws Exception {
		if (parkingSlots.size() <= MAX_SIZE_SLOTS) {
			for (ParkingSlot parkingSlotEntity : parkingSlots) {
				boolean isParked = parkingSlotEntity.isParked();
				if (!isParked) {
					parkingSlotEntity.setParked(true);
					parkingSlotEntity.setVehicle(vehicle);
					return;
				}
			}
		}

		else if (parkingSlots.size() >= MAX_SIZE_SLOTS) {
			throw new Exception();
		}

		slotNumber++;
		ParkingSlot parkingSlot = new ParkingSlot(vehicle, slotNumber);

		String colour = parkingSlot.getVehicle().getColour();

		populateColourBasedVehiclesMap(vehicle, colour);
		populateRegistrationNumberToSlotNumber(vehicle, slotNumber);

		parkingSlots.add(parkingSlot);

	}

	private void populateRegistrationNumberToSlotNumber(Vehicle vehicle, int slotNumber) {

		registrationNumberToSlotNumber.put(vehicle.getRegistrationNumber(), slotNumber);

	}

	private void populateColourBasedVehiclesMap(Vehicle vehicle, String colour) {
		List<Vehicle> vehicles = colourBasedVehiclesMapper.get(colour);
		if (vehicles.isEmpty()) {
			vehicles = new ArrayList<Vehicle>();
		}
		vehicles.add(vehicle);
		colourBasedVehiclesMapper.put(colour, vehicles);
	}

	void unPark(int slotNumber) {

		for (ParkingSlot parkingSlot : parkingSlots) {
			int slotNumberValue = parkingSlot.getSlotNumber();
			if (slotNumberValue == slotNumber)
				parkingSlot.unpark();
		}

	}

	void getStatus() {
		for (ParkingSlot parkingSlot : parkingSlots) {
			int slotNumber = parkingSlot.getSlotNumber();
			Vehicle vehicle = parkingSlot.getVehicle();
			String colour = vehicle.getColour();
			String reqistrationNumber = vehicle.getRegistrationNumber();

		}
	}

	List<Vehicle> getAllVehiclesOfParticularColour(String colour) {
		return colourBasedVehiclesMapper.get(colour);

	}

	Integer registrationNumberToSlotNumber(String regNo) {
		return registrationNumberToSlotNumber.get(regNo);

	}

	public static void main(String[] args) {

	}

}
