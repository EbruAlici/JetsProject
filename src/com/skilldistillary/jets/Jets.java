package com.skilldistillary.jets;

public abstract class Jets {
	
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
	
	
	@Override
	public String toString() {
		return "Jets [Model: " + model +"]" + ", [Speed: " + speed + "]" + ", [Range= " + range + "] " + " ,[Price= " + price + "]\n";
	}
	public void fly() {
		System.out.println("flies " + (range / speed) + " hours");
		System.out.println("-------------------------------------------------\n");
	}
}

