package com.skilldistillery.jets.entities;

public class CargoJet extends Jet implements CargoCarrier {

	public CargoJet() {
		super();
	}

	public CargoJet(String model, int speedInMPH, int range, double price) {
		super(model, speedInMPH, range, price);
	}

	@Override
	public void loadCargo() {
		System.out.println(getModel() + " is loading its cargo.");
		
	}
	

}
