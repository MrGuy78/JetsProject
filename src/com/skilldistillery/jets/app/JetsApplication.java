package com.skilldistillery.jets.app;

import java.util.Scanner;

public class JetsApplication {

	private Airfield airfield = new Airfield();
	private static Scanner sc;
	
	//NO other fields; NO list of jets
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		JetsApplication app = new JetsApplication();
		app.launch();
		
		
		sc.close();

	}
	
	private void launch() {
	}
	
	private void displayUserMenu() {
		System.out.println("   ************* AirField *************");
		System.out.println("1. List fleet								");
		System.out.println("2. Fly all jets				6. DOGFIGHT! ");
		System.out.println("3. View fastest jet			7. Add a jet to the fleet ");
		System.out.println("4. View longest range jet	8.Remove a jet from the fleet ");
		System.out.println("5. Load all Cargo Jets \"	9. Quit.");
		
		//loop
		//displayUserMenu
		//get choice from scanner
		//act on user choice
		//sysouts for menu
	}

}
