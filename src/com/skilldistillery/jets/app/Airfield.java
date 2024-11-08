package com.skilldistillery.jets.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.skilldistillery.jets.entities.CargoJet;
import com.skilldistillery.jets.entities.Jet;

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
				
				switch(jetType) {
					case "cargo":
						Jet newJet = new CargoJet(model, speed, range, price);
						fleet.add(newJet);
						//String model, int speedInMPH, int range, double price
						//add to fleet
						break;
						
					case "fighter":
						
					
						break;
						
					case "passenger":
					
					
						break;
				}
				//Jet newJet = new PassengerJet(mod,sp,rng,pr);
				//fleet.add(newJet);
			}
		} catch (IOException e) {
			System.err.println(e);
		}

		// change fileName - bufferedreader template
	}

	// TODO: public methods for handling jets

}
