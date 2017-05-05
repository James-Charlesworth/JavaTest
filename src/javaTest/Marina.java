package javaTest;

public class Marina {

	private String name;
	private String address;
	private int maxBoats;
	
	
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
	
	
	
	
}
