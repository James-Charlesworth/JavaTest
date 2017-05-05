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
//		System.out.println(all);
//		System.out.println(marinas);
//		System.out.println(boats);
//		System.out.println(people);
		
		ArrayList<Marina> marinaObjs = createMarinas(marinas);
		ArrayList<Boat> boatObjs = createBoats(boats);
		ArrayList<Person> peopleObjs = createPeople(people);
		
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
