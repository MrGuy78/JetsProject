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
		//loop
		//displayUserMenu
		//get choice from scanner
		//act on user choice
	}
	
	private void displayUserMenu() {
		//sysouts for menu
	}

}
