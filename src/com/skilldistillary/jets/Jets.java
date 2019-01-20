package com.skilldistillary.jets;

public class Jets {
	
	String model;
	private int speed;
	private int range;
	private long price;

	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = (int) speed;
	}
	public double getRange() {
		return range;
	}
	public void setRange(double range) {
		this.range = (int) range;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = (long) price;
	}
	
	public String toOutPut() {
	return " Plane model: " + model + " Speed: " + speed + " Range: " + range 
			+" Miles " + " Price: $" + price;
	
}
}

