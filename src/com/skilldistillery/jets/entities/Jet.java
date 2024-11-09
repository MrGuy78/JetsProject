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
		double flyTime = range / speedInMPH;
		double machSpeed = speedInMPH / 767.3;
		System.out.println("This " + this.model + " is flying high! But only for " + flyTime + " hours.");
		System.out.println("And it flies Mach " + machSpeed + ".");
	}
	
	public double getSpeedInMach() {
		return 0.0;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getSpeedInMPH() {
		return speedInMPH;
	}

	public void setSpeedInMPH(int speedInMPH) {
		this.speedInMPH = speedInMPH;
	}

	public double getRange() {
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
		return "Jet [model=" + model + ", speedInMPH=" + speedInMPH 
				+ ", range=" + range + ", price=" + price + "]";
	}
	
	

}
