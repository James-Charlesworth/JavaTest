package javaTest;

import java.util.ArrayList;

public class Main {
	
	
	//static ArrayList<Marina> marinaObjs = new ArrayList<Marina>();
	//static ArrayList<Boat> boatObjs = new ArrayList<Boat>();
	//static ArrayList<Person> peopleObjs = new ArrayList<Person>();
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ReadFile reader1 = new ReadFile();
		
		

		Person testPerson1 = new Person("testfirstname","testsurname","00/00/0000","testnationality", "testvisainfo");
		Boat testBoat1 = new Boat("testname","testcountry",100, testPerson1, "captain");
		Marina testMarina1 = new Marina("testname", "testaddress", 100);
		
		ArrayList<String> all = reader1.fileReader("stage_5_input.txt");
		ArrayList<String> marinas = reader1.sortArrays(all, "marinas");
		ArrayList<String> boats = reader1.sortArrays(all, "boats");
		ArrayList<String> people = reader1.sortArrays(all, "people");

		
		ArrayList<Marina> marinaObjs = createMarinas(marinas);
		ArrayList<Boat> boatObjs = createBoats(boats);
		ArrayList<Person> peopleObjs = createPeople(people);
		
	
	
		//create relationships
//		Boaty McBoatface captained by Peter Jackson
		boatObjs.get(2).setCaptain(peopleObjs.get(6));
//		Boaty McBoatface owned by Emma Watson
		boatObjs.get(2).setOwners(peopleObjs.get(8));
//		Boaty McBoatface crewed by Adele Ginger
		boatObjs.get(2).setCrew(peopleObjs.get(7));
//		Boaty McBoatface crewed by Avril Lavigne
		boatObjs.get(2).setCrew(peopleObjs.get(9));
//		Boaty McBoatface crewed by Brian Johnson
		boatObjs.get(2).setCrew(peopleObjs.get(4));
//		Santa Maria crewed by Peter Jackson
		boatObjs.get(0).setCrew(peopleObjs.get(6));
//		Mary’s dream owned by Mary Jones
		boatObjs.get(1).setOwners(peopleObjs.get(1));
//		Aquaholic Captained by Linus Torvalds
		boatObjs.get(3).setCaptain(peopleObjs.get(5));
//		Aquaholic owned by Bill Knightley
		boatObjs.get(3).setOwners(peopleObjs.get(3));
//		Aquaholic owned by David Green
		boatObjs.get(3).setOwners(peopleObjs.get(0));
		
		
		
//		Aquaholic moored at Venice
		marinaObjs.get(1).addBoat(boatObjs.get(3));
//		Mary’s dream moored at Monaco
		marinaObjs.get(0).addBoat(boatObjs.get(1));
//		Boaty McBoatface moored at Monaco
		marinaObjs.get(0).addBoat(boatObjs.get(2));
//		Santa Maria moored at Venice
		marinaObjs.get(1).addBoat(boatObjs.get(0));

		
		//Questions
		
		//oldest person at each port
		int year = 3000;
		for (Marina m:marinaObjs){
			for (Boat b:m.getBoats()){
				for (Person p:b.getAllcrew()){
					String[] age = p.getDob().split("/");
					if (Integer.parseInt(age[2])<year){
						year = Integer.parseInt(age[2]);
						
					}
				}
			}
			
		}
		//sysout
		
		//no. of boats at each port
		
		
		//move a boat
		
		
		//deliver a map of all boats in a marina
		
		
		//report all people in a harbour ordered by boat.
		
		
		
		
	}

	
	
	
	
	
	private static ArrayList<Marina> createMarinas(ArrayList<String> marinas) {
		ArrayList<Marina> marinaObjs = new ArrayList<Marina>();
		for (int i = 1; i<marinas.size()-2;i=i+3){
			marinaObjs.add(new Marina(marinas.get(i), marinas.get(i+1), Integer.parseInt(marinas.get(i+2))));
		}
		return marinaObjs;
		
	}
	
	private static ArrayList<Boat> createBoats(ArrayList<String> boats) {
		ArrayList<Boat> boatObjs = new ArrayList<Boat>();
		for (int i = 1; i<boats.size()-2;i=i+3){
			boatObjs.add(new Boat(boats.get(i), boats.get(i+1), Double.parseDouble(boats.get(i+2)), null, ""));
		}
		return boatObjs;
		
	}
	
	private static ArrayList<Person> createPeople(ArrayList<String> people) {
		ArrayList<Person> peopleObjs = new ArrayList<Person>();
		for (int i = 1; i<people.size()-2;i=i+3){
			
			if (people.get(i+2).equals("British")){
				peopleObjs.add(new Person(people.get(i), null, people.get(i+1), people.get(i+2), null));
				//i++;
			}else{
				peopleObjs.add(new Person(people.get(i), null, people.get(i+1), people.get(i+2), people.get(i+3)));
				i++;
			}
				
		}
		return peopleObjs;
		
	}

}
