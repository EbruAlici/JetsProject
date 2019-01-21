package com.skilldistillary.jets;

import java.util.Scanner;

public class JetsApplication {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int numberEntered = 0;

		AirFields airport = new AirFields();
		CargoPlane cargo = new CargoPlane();
		cargo.setModel("737-800");
		cargo.setPrice(78_000_000);
		cargo.setRange(2935);
		cargo.setSpeed(842);

		Jets passenger = new JetImpl();
		passenger.setModel("737-700");
		passenger.setPrice(80_000_000);
		passenger.setRange(3010);
		passenger.setSpeed(834);

		FighterJets fighters = new FighterJets();
		fighters.setModel("F-16");
		fighters.setPrice(14_000_000);
		fighters.setRange(2022);
		fighters.setSpeed(1500);

		Jets business = new JetImpl();
		business.setModel("Lear Jet 75");
		business.setPrice(13_000_000);
		business.setRange(2000);
		business.setSpeed(800);

		Jets transport = new JetImpl();
		transport.setModel("C-17 Globemaster III");
		transport.setPrice(218_000_000);
		transport.setRange(2400);
		transport.setSpeed(830);

		airport.addJet(cargo);
		airport.addCargo(cargo);
		airport.addJet(passenger);
		airport.addJet(fighters);
		airport.addFighter(fighters);
		airport.addJet(business);
		airport.addJet(transport);

		// System.out.println(airport.getJetList()[1]);
		// System.out.println(cargo.setModel);
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
		int num = 0;
		do {

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
	







	public static void printJets(AirFields airport) {
		Jets[] jetList = airport.getJetList();
		for(int i = 0; i < jetList.length; i++) {
			if(jetList[i] != null ) {
				System.out.println(jetList[i]);
			}
		}
	}

	public static void flyJets(AirFields airport) {
		Jets[] jetList = airport.getJetList();
		for(int i = 0; i < jetList.length; i++) {
			if(jetList[i] != null) {
				System.out.println(jetList[i]);
				jetList[i].fly();
			}
		}
	} 
	
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

	private static void loadAllCargoJets(AirFields airport) {
		CargoCarrier[] jetList = airport.getCargoJets();
		for(int i = 0; i < jetList.length; i++) {
			if(jetList[i] != null) {
				System.out.println(jetList[i]);
				jetList[i].loadCargo();
			}
		}
	}
	
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
