package com.skilldistillary.jets;

public class CargoPlane extends Jets implements CargoCarrier{

	@Override
	public void loadCargo() {
		System.out.println("loading cargo");		
	}
		

}
