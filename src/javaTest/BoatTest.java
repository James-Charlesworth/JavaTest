package javaTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class BoatTest {

	//test all getters
	
	@Test
	public void testgetName() {
		Person testPerson1 = new Person("testfirstname","testsurname","00/00/0000","testnationality", "testvisainfo");
		Boat testBoat1 = new Boat("testname","testcountry",100, testPerson1, "captain");
		assertEquals("testname", testBoat1.getName());
	}
	
	@Test
	public void testgetCountry() {
		Person testPerson1 = new Person("testfirstname","testsurname","00/00/0000","testnationality", "testvisainfo");
		Boat testBoat1 = new Boat("testname","testcountry",100, testPerson1, "captain");
		assertEquals("testcountry", testBoat1.getCountry());
	}
	
	@Test
	public void testgetSize() {
		Person testPerson1 = new Person("testfirstname","testsurname","00/00/0000","testnationality", "testvisainfo");
		Boat testBoat1 = new Boat("testname","testcountry",100, testPerson1, "captain");
		assertEquals(100, testBoat1.getSize());
	}
	
	@Test
	public void testgetCaptain() {
		Person testPerson1 = new Person("testfirstname","testsurname","00/00/0000","testnationality", "testvisainfo");
		Boat testBoat1 = new Boat("testname","testcountry",100, testPerson1, "captain");
		assertEquals("testfirstname", testBoat1.getCaptain().getFirstName());
	}
	
	@Test
	public void testgetOwners() {
		Person testPerson1 = new Person("testfirstname","testsurname","00/00/0000","testnationality", "testvisainfo");
		Boat testBoat1 = new Boat("testname","testcountry",100, testPerson1, "owner");
		assertEquals(1, testBoat1.getOwners().size());
	}
	
	@Test
	public void testgetCrew() {
		Person testPerson1 = new Person("testfirstname","testsurname","00/00/0000","testnationality", "testvisainfo");
		Boat testBoat1 = new Boat("testname","testcountry",100, testPerson1, "crew");
		assertEquals(1, testBoat1.getCrew().size());
	}
	
	@Test
	public void testgetallCrew() {
		Person testPerson1 = new Person("testfirstname","testsurname","00/00/0000","testnationality", "testvisainfo");
		Person testPerson2 = new Person("testfirstname","testsurname","00/00/0000","testnationality", "testvisainfo");
		Person testPerson3 = new Person("testfirstname","testsurname","00/00/0000","testnationality", "testvisainfo");
		Boat testBoat1 = new Boat("testname","testcountry",100, testPerson1, "captain");
		testBoat1.setCrew(testPerson2);
		testBoat1.setCrew(testPerson3);
		assertEquals(3, testBoat1.getAllcrew().size());
	}

}
