package javaTest;

public class Boat implements Vehicle {

	private String name;
	private String country;
	private int size;//in feet?
	
	
	public Boat(String name, String country, int size) {
		super();
		this.name = name;
		this.country = country;
		this.size = size;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public int getSize() {
		return size;
	}


	public void setSize(int size) {
		this.size = size;
	}


	@Override
	public int getSpeed() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public void accelerate() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void deccelerate() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
