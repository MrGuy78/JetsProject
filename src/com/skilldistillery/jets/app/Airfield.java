package com.skilldistillery.jets.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.skilldistillery.jets.entities.CargoJet;
import com.skilldistillery.jets.entities.FighterJet;
import com.skilldistillery.jets.entities.Jet;
import com.skilldistillery.jets.entities.PassengerJet;

public class Airfield {

	private List<Jet> fleet = new ArrayList<>();
	// No other fields

	public Airfield() {
		loadJetsFromFile("jets.txt");
	}

	private void loadJetsFromFile(String fileName) {

		try (BufferedReader bufIn = new BufferedReader(new FileReader("jets.txt"))) {
			String line;
			while ((line = bufIn.readLine()) != null) {
				String[] fields = line.split(",");
				String jetType = fields[0];
				String model = fields[1];
				int speed = Integer.parseInt(fields[2]);
				int range = Integer.parseInt(fields[3]);
				double price = Double.parseDouble(fields[4]);

				Jet newJet = null;
				switch (jetType) {
				case "cargo":
					newJet = new CargoJet(model, speed, range, price);
					fleet.add(newJet);
					break;

				case "fighter":
					newJet = new FighterJet(model, speed, range, price);
					fleet.add(newJet);
					break;

				case "passenger":
					newJet = new PassengerJet(model, speed, range, price);
					fleet.add(newJet);
					break;
				}
			}
		} catch (IOException e) {
			System.err.println(e);
		}

	}
	public void listFleet() {
		for (Jet jet : fleet) {
			System.out.println(jet);
		}
	}
	public void flyAllJets() {
		for (Jet jet : fleet) {
			jet.fly();
		}
	}
	// TODO: public methods for handling jets

	
	
	
	
	
}
