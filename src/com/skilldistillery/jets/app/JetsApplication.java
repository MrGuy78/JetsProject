package com.skilldistillery.jets.app;

import java.util.Scanner;

import com.skilldistillery.jets.entities.Jet;
import com.skilldistillery.jets.entities.PassengerJet;

public class JetsApplication {

	private Airfield airfield = new Airfield();
	private static Scanner sc;

	// NO other fields; NO list of jets

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		JetsApplication app = new JetsApplication();
		app.launch();

		sc.close();

	}

	private void launch() {
		// loop
		// displayUserMenu
		while (true) {

			displayUserMenu();
			// get choice from scanner
			String userChoice = getUserChoice();
			if (userChoice.equals("9")) {
				System.out.println("Thanks for visiting the Airfield! Safe travels!");
				break;
			}
			// act on user choice
			processMenuChoice(userChoice);
		}
	}

	private String getUserChoice() {
		String choice = sc.nextLine();
		return choice;
	}

	private void displayUserMenu() {
		System.out.println("   	************* AirField *************");
		System.out.println("1. List fleet								");
		System.out.println("2. Fly all jets			6. DOGFIGHT! ");
		System.out.println("3. View fastest jet		7. Add a jet to the fleet ");
		System.out.println("4. View longest range jet	8. Remove a jet from the fleet ");
		System.out.println("5. Load all Cargo Jets 		9. Quit.");

	}

	private void processMenuChoice(String choice) {
		switch (choice) {
		case "1":
			airfield.listFleet();
			break;
		case "2":
			airfield.flyAllJets();
			break;
		case "3":
			Jet fastestJet = airfield.getFastestJet();
			System.out.println(fastestJet);
			break;
		case "4":
			Jet longestRangeJet = airfield.getLongestRangeJet();
			System.out.println(longestRangeJet);
			break;
		case "5":
			airfield.loadAllCargoJets();
			break;
		case "6":
			airfield.callCombatReady();
			break;
		case "7":
			System.out.println("What model is your jet? (Airbus 380)");
			String model = sc.nextLine();
			System.out.println("What is the max speed? (500)");
			int speed = sc.nextInt();
			System.out.println("What is the max range? (6000)");
			int range = sc.nextInt();
			System.out.println("How much does this jet cost? (23000000)");
			double price = sc.nextDouble();
			Jet newPassengerJet = new PassengerJet(model, speed, range, price);
			airfield.addJet(newPassengerJet);
			break;
		case "8":
			airfield.listFleet();
			System.out.println("Which jet would you like to remove?");
			int whichJet = sc.nextInt();
			airfield.removeJet(whichJet);
			//remove a jet from fleet
			break;
		default:
			System.out.println("That is not a valid entry. Please try again.");
			break;
		}
	}
}
