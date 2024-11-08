package com.skilldistillery.jets.entities;

public abstract class Jet {
	private String model;
	private int speedInMPH;
	private int range;
	private double price;

	public Jet() {}
	
	public Jet(String model, int speedInMPH, int range, double price) {
		super();
		this.model = model;
		this.speedInMPH = speedInMPH;
		this.range = range;
		this.price = price;
	}
	
	public void fly() {
		//override in subclass
		System.out.println(this.model + " flying."); //finish
	}
	
	public double getSpeedInMach() {
		return 0.0; //finish, MPH -> Mach
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getSpeedInMPH() {
		return speedInMPH;
	}

	public void setSpeedInMPH(int speedInMPH) {
		this.speedInMPH = speedInMPH;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Jet [model=" + model + ", speedInMPH=" + speedInMPH + ", range=" + range + ", price=" + price + "]";
	}
	
	

}
