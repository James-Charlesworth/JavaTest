package javaTest;

import java.util.ArrayList;

public class Marina {

	private String name;
	private String address;
	private int maxBoats;
	private int currentBoats;
	private ArrayList<Boat> boats = new ArrayList<Boat>();
	
	
	public Marina(String name, String address, int maxBoats) {
		super();
		this.name = name;
		this.address = address;
		this.maxBoats = maxBoats;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public int getMaxBoats() {
		return maxBoats;
	}


	public void setMaxBoats(int maxBoats) {
		this.maxBoats = maxBoats;
	}

	public int getCurrentBoats() {
		return currentBoats;
	}

	public void setCurrentBoats(int currentBoats) {
		this.currentBoats = currentBoats;
	}
	
	public ArrayList<Boat> getBoats() {
		return boats;
	}

	public void setBoats(ArrayList<Boat> boats) {
		this.boats = boats;
	}


	
	
	
	
	
}
