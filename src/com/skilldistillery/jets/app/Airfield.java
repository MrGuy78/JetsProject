package com.skilldistillery.jets.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.skilldistillery.jets.entities.CargoCarrier;
import com.skilldistillery.jets.entities.CargoJet;
import com.skilldistillery.jets.entities.CombatReady;
import com.skilldistillery.jets.entities.FighterJet;
import com.skilldistillery.jets.entities.Jet;
import com.skilldistillery.jets.entities.PassengerJet;

public class Airfield {

	private List<Jet> fleet = new ArrayList<>();

	public Airfield() {
		loadJetsFromFile("jets.txt");
	}

	private void loadJetsFromFile(String fileName) {

		try (BufferedReader bufIn = new BufferedReader(new FileReader("jets.txt"))) {
			String line;
			while ((line = bufIn.readLine()) != null) {
				String[] fields = line.split(",");
				String jetType = fields[0];
				String model = fields[1].substring(1, fields[1].length()-1);
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
		
		for (int i = 0; i < fleet.size(); i++) {
			System.out.println(i + ": " + fleet.get(i));
		}
		System.out.println();
	}
	public void flyAllJets() {
		for (Jet jet : fleet) {
			jet.fly();
		}
	}
	public Jet getFastestJet() {
		Jet fastestJet = fleet.get(0);
		for (Jet jet : fleet) {
			if(jet.getSpeedInMPH() > fastestJet.getSpeedInMPH()) {
				fastestJet = jet;
			}
		}
		return fastestJet;
	}
	public Jet getLongestRangeJet() {
		Jet longestRangeJet = fleet.get(0);
		for (Jet jet : fleet) {
			if(jet.getRange() > longestRangeJet.getRange()) {
				longestRangeJet = jet;
			}
		}
		return longestRangeJet;
	}
	public void loadAllCargoJets() {
		for (Jet jet : fleet) {
			if(jet instanceof CargoCarrier) {
				((CargoCarrier) jet).loadCargo();
			}
		}
	}
	public void callCombatReady() {
		for (Jet jet : fleet) {
			if(jet instanceof CombatReady) {
				((CombatReady) jet).fight();
			}
		}
	}
	public void addJet(Jet newJet) {
		fleet.add(newJet);
	}

	public Jet removeJet(int index) {
		return fleet.remove(index);
	}
	
}
