package com.skilldistillery.jets.app;

import java.util.Scanner;

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
				break;
			}
			// act on user choice
			processMenuChoice(userChoice);
		}
	}

	private String getUserChoice() {
		String choice = sc.next();
		return choice;
	}

	private void displayUserMenu() {
		System.out.println("   		************* AirField *************");
		System.out.println("1. List fleet								");
		System.out.println("2. Fly all jets				6. DOGFIGHT! ");
		System.out.println("3. View fastest jet			7. Add a jet to the fleet ");
		System.out.println("4. View longest range jet	8. Remove a jet from the fleet ");
		System.out.println("5. Load all Cargo Jets \"	9. Quit.");

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

			break;
		case "4":

			break;
		case "5":

			break;
		case "6":

			break;
		case "7":

			break;
		case "8":

			break;
		case "9":

			break;
		default:

		}
	}
}
