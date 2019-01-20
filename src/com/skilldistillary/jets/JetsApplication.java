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
		
		PassengerPlane passenger = new PassengerPlane();
		passenger.setModel("737-700");
		passenger.setPrice(80_000_000);
		passenger.setRange(3010);
		passenger.setSpeed(834);
		
		FighterJets fighters = new FighterJets();
		fighters.setModel("F-16");
		fighters.setPrice(14_000_000);
		fighters.setRange(2022);
		fighters.setSpeed(1500);
		
		BusinessJets business = new BusinessJets();
		business.setModel("Lear Jet 75");
		business.setPrice(13_000_000);
		business.setRange(2000);
		business.setSpeed(800);
	
		TransportJets transport = new TransportJets();
		transport.setModel("C-17 Globemaster III");
		transport.setPrice(218_000_000);
		transport.setRange(2400);
		transport.setSpeed(830);
		
		
		airport.addJet(cargo);
		airport.addJet(passenger);
		airport.addJet(fighters);
		airport.addJet(business);
		airport.addJet(transport);
		
		//System.out.println(airport.getJetList()[1]);
		//System.out.println(cargo.setModel);
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
		numberEntered = keyboard.nextInt();
		
		
	while(numberEntered > 0) {
		
		//int num = keyboard.nextInt();
		if(num == 1) {
			System.out.println("number 1");
			System.out.println(cargo.toOutPut());
			System.out.println(passenger.toOutPut());
			System.out.println(fighters.toOutPut());
			System.out.println(business.toOutPut());
			System.out.println(transport.toOutPut());
		}
		if(num ==2) {
			System.out.println("number 2");
		}
		if(num == 3) {
			System.out.println("number 3");
		}
		if(num == 4) {
			System.out.println("number 4");
		}
		if(num == 5) {
			System.out.println("number 5");
		}
		if(num == 6) {
			System.out.println("number 6");
		}
		if(num == 7){
			System.out.println("number 7");
		}
		if(num == 8) {
			System.out.println("Good Bye");
			break;
			
		}
		
		}
	}


	
	
	
}
