package com.skilldistillary.jets;

public class FighterJets extends Jets implements CombatReady{

	@Override
	public void fight() {
		System.out.println("shoot missiles");
	}	
	
}
