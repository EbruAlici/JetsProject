package com.skilldistillary.jets;

import java.util.Scanner;

public class JetSim {

	
	public void run(){
		Scanner keyboard = new Scanner(System.in);


		AirFields airport = loadAirField();
		
		
		
		// next part displays menu to users
		int num = 0;  // create num here so it would work in while loop
		do { // loop to take input and keep going till users hit 8
			showMenu();
			
			num = keyboard.nextInt();
			switch (num) {
			case 1:
				printJets(airport);
			  break;
			case 2:
				flyJets(airport);
			  break;
			case 3:
				getFastestJet(airport);
			  break;
			case 4:
				getLongestRangeJet(airport);
				break;
			case 5:
				loadAllCargoJets(airport);
			  break;
			case 6:
				Jets jet= createJet(keyboard);
				airport.addJet(jet);
				break;
			case 7:
				dogFight(airport);
				break;
			case 8:
				System.out.println("Good Bye");
				break;
			  
			default:
				System.out.println("Enter a number between 1-8.");
			}
		} while (num != 8);
		
	}
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
		System.out.println("Jet with the longest range");
		System.out.println(longest);
		
	}
	//adding a jet from user input
	private Jets createJet(Scanner keyboard) {
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
	private void loadAllCargoJets(AirFields airport) {
		Jets[] jetList = airport.getJetList();
		for(int i = 0; i < jetList.length; i++) {
			if(jetList[i] != null && jetList[i] instanceof CargoCarrier) {
				System.out.println(jetList[i]);
				((CargoCarrier)jetList[i]).loadCargo();
			}
		}
		
	}
	//fighting fighters
	private void dogFight(AirFields airport) {
		Jets[] jetList = airport.getJetList();
		for(int i = 0; i < jetList.length; i++) {
			if(jetList[i] != null && jetList[i] instanceof CombatReady) {
				System.out.println(jetList[i]);
				((CombatReady)jetList[i]).fight();
			}
		
		}
	}
	public void showMenu() {
		System.out.println("\nEnter a number from the options below. ");
		System.out.println("Enter (1): To see all jets in the airfield. ");
		System.out.println("Enter (2): To fly all the jets. ");
		System.out.println("Enter (3): To see the fastest jet. ");
		System.out.println("Enter (4): To view the jet with the longest range. ");
		System.out.println("Enter (5): To load all the jets.");
		System.out.println("Enter (6): To add a jet to the airfield ");
		System.out.println("Enter (7): For a Dog Fight. ");
		System.out.println("Enter (8): To exit.\n\n");
	}
	public AirFields loadAirField() {
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
		transport.setModel("C-17 Globemaster");
		transport.setPrice(218_000_000);
		transport.setRange(2400);
		transport.setSpeed(830);

		AirFields airport = new AirFields();
		airport.addJet(cargo);// adding cargo to jet list and CargoCarrier list
		
		airport.addJet(fighters);// adding fighters to jet list and CombatReady list
		
		airport.addJet(passenger);// addding 3 basic jets to jet list
		airport.addJet(business);
		airport.addJet(transport);
		return airport;

		
		
	}
	
}

