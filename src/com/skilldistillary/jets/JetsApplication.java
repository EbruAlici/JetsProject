package com.skilldistillary.jets;

import java.util.Scanner;

public class JetsApplication {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);


		AirFields airport = new AirFields();// creating airfield to add jets to
		
		
		CargoPlane cargo = new CargoPlane();// creating a cargo plane and setting it's values
		cargo.setModel("737-800");
		cargo.setPrice(78_000_000);
		cargo.setRange(2935);
		cargo.setSpeed(842);

		Jets passenger = new JetImpl();// creating a basic jet and setting it's values
		passenger.setModel("737-700");
		passenger.setPrice(80_000_000);
		passenger.setRange(3010);
		passenger.setSpeed(834);

		FighterJets fighters = new FighterJets();// creating a FighterJet and setting it's values
		fighters.setModel("F-16");
		fighters.setPrice(14_000_000);
		fighters.setRange(2022);
		fighters.setSpeed(1500);

		Jets business = new JetImpl();// creating a basic Jet and setting it's values
		business.setModel("Lear Jet 75");
		business.setPrice(13_000_000);
		business.setRange(2000);
		business.setSpeed(800);

		Jets transport = new JetImpl();// creating a generic Jet and setting it's values
		transport.setModel("C-17 Globemaster III");
		transport.setPrice(218_000_000);
		transport.setRange(2400);
		transport.setSpeed(830);

		airport.addJet(cargo);// adding cargo to jet list and CargoCarrier list
		airport.addCargo(cargo);// cargo is a jet and a CargoCarrier
		
		airport.addJet(fighters);// adding fighters to jet list and CombatReady list
		airport.addFighter(fighters);// fighters is a jet and a CombatReady
		
		airport.addJet(passenger);// addding 3 basic jets to jet list
		airport.addJet(business);
		airport.addJet(transport);

		
		// next part displays menu to users
		System.out.println("For a list of jets. ");
		System.out.println("Enter: 1");
		System.out.println("To fly all jets. ");
		System.out.println("Enter: 2");
		System.out.println("View fastest jet. ");
		System.out.println("Enter: 3");
		System.out.println("View jet with the longest range. ");
		System.out.println("Enter: 4");
		System.out.println("Load all cargo jets. ");
		System.out.println("Enter: 5");
		System.out.println("Dogfight. ");
		System.out.println("Enter: 6");
		System.out.println("Add jet to fleet.");
		System.out.println("Enter: 7");
		System.out.println("To Quit");
		System.out.println("Enter: 8");
		int num = 0;  // create num here so it would work in while loop
		do { // loop to take input and keep going till users hit 8

			num = keyboard.nextInt();
			if (num == 1) {
				printJets(airport);
			}
			if (num == 2) {
				flyJets(airport);
			}
			if (num == 3) {
				getFastestJet(airport);
			}
			if (num == 4) {
				getLongestRangeJet(airport);
			}
			if (num == 5) {
				//System.out.println("number 5");
				loadAllCargoJets(airport);
			}
			if (num == 6) {
//				System.out.println("number 6");
				dogFigth(airport);
			}
			if (num == 7) {
//				System.out.println("number 7");
				Jets jet= addJet(keyboard);
				airport.addJet(jet);
			}
			if (num == 8) {
				System.out.println("Good Bye");

			}
		} while (num != 8);
	}
	// goes through list of jets and prints out jets using toString of jet
	public static void printJets(AirFields airport) {
		Jets[] jetList = airport.getJetList();
		for(int i = 0; i < jetList.length; i++) {
			if(jetList[i] != null ) {
				System.out.println(jetList[i]);
			}
		}
	}

	// goes through list of jets and calls their fly
	public static void flyJets(AirFields airport) {
		Jets[] jetList = airport.getJetList();
		for(int i = 0; i < jetList.length; i++) {
			if(jetList[i] != null) {
				System.out.println(jetList[i]);
				jetList[i].fly();
			}
		}
	} 
	
	// goes through jet and finds the fastest 
	public static void getFastestJet(AirFields airport) {
		Jets[] jetList = airport.getJetList();
		Jets fast = jetList[0];
		for(int i = 0; i < jetList.length; i++) {
			if(jetList[i] != null && (jetList[i].getSpeed() > fast.getSpeed())) {
				fast = jetList[i];
			}
		}
		System.out.println("Fastest Jet");
		System.out.println(fast);
		
	}
	//goes thru jets to fine the longest range
	public static void getLongestRangeJet(AirFields airport) {
		Jets[] jetList = airport.getJetList();
		Jets longest = jetList[0];
		for(int i = 0; i < jetList.length; i++) {
			if(jetList[i] != null && (jetList[i].getRange() > longest.getRange())) {
				longest = jetList[i];
			}
		}
		System.out.println("Longest Range Jet");
		System.out.println(longest);
		
	}
	//adding a jet from user input
	private static Jets addJet(Scanner keyboard) {
		Jets newJetAdded = new JetImpl();
		System.out.println("Enter Model: ");
		String model = keyboard.next();
		System.out.println("Enter Speed: ");
		int speed = keyboard.nextInt();
		System.out.println("Enter Range: ");
		int range = keyboard.nextInt();
		System.out.println("Enter Price: ");
		long price = keyboard.nextLong();
		newJetAdded.setModel(model);
		newJetAdded.setSpeed(speed);
		newJetAdded.setRange(range);
		newJetAdded.setPrice(price);
		return newJetAdded;
		
	}
	//loading cargo to cargo carrier
	private static void loadAllCargoJets(AirFields airport) {
		CargoCarrier[] jetList = airport.getCargoJets();
		for(int i = 0; i < jetList.length; i++) {
			if(jetList[i] != null) {
				System.out.println(jetList[i]);
				jetList[i].loadCargo();
			}
		}
	}
	//fighting fighters
	private static void dogFigth(AirFields airport) {
		CombatReady[] jetList = airport.getFighterJets();
		for(int i = 0; i < jetList.length; i++) {
			if(jetList[i] != null) {
				System.out.println(jetList[i]);
				jetList[i].fight();
			}
		}
	}
}
