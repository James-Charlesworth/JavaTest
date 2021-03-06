package javaTest;

import java.util.ArrayList;

public class Boat implements Vehicle {

	private String name;
	private String country;
	private double size;//in feet?
	private ArrayList<Person> allcrew = new ArrayList<Person>();
	private Person captain;
	private ArrayList<Person> owners = new ArrayList<Person>();
	private ArrayList<Person> crew = new ArrayList<Person>();
	
	
	public Boat(String name, String country, double size, Person person, String role) {
		super();
		this.name = name;
		this.country = country;
		this.size = size;
		if (role.equals("captain")){
			setCaptain(person);
		}else if(role.equals("owner")){
			setOwners(person);
		}else if(role.equals("crew")){
			this.crew.add(person);
		}else if (role.equals("")){
			this.captain = captain;
			this.crew = crew;
			this.owners = owners;
		}
			
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


	public double getSize() {
		return size;
	}


	public void setSize(int size) {
		this.size = size;
	}

	
	public ArrayList<Person> getAllcrew() {
		return allcrew;
	}


	public void setAllcrew(ArrayList<Person> allcrew) {
		this.allcrew = allcrew;
	}


	public Person getCaptain() {
		return captain;
	}


	public void setCaptain(Person captain) {
		if (!this.crew.contains(captain)){
			this.captain = captain;
			this.allcrew.add(captain);
		}
	}


	public ArrayList<Person> getOwners() {
		return owners;
	}


	public void setOwners(ArrayList<Person> owners) {
		this.owners = owners;
		for (Person p: owners){
			this.allcrew.add(p);
		}
	}
	
	public void setOwners(Person owner){
		this.owners.add(owner);
	}


	public ArrayList<Person> getCrew() {
		return crew;
	}


	public void setCrew(ArrayList<Person> crew) {
		if(!crew.contains(this.captain)){
			this.crew = crew;
			this.allcrew = crew;
		}
			
	}

	public void setCrew(Person crew){
		if(this.captain != crew){
			this.crew.add(crew);
			this.allcrew.add(crew);
		}
			
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
