package com.skilldistillery.jets.entities;

public class FighterJet extends Jet implements CombatReady {

	public FighterJet() {
		super();
	}

	public FighterJet(String model, int speedInMPH, int range, double price) {
		super(model, speedInMPH, range, price);
	}

	@Override
	public void fight() {
		// TODO Auto-generated method stub
		
	}
	
	

}
