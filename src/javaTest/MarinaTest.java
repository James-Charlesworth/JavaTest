package javaTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class MarinaTest {

	//test getters anme address max current arrayofboats
	Marina testMarina1 = new Marina("testname", "testaddress", 100);
	Person testPerson1 = new Person("testfirstname","testsurname","00/00/0000","testnationality", "testvisainfo");
	Boat testBoat1 = new Boat("testname","testcountry",100, testPerson1, "captain");
	Boat testBoat2 = new Boat("testname","testcountry",100, testPerson1, "captain");
	Boat testBoat3 = new Boat("testname","testcountry",100, testPerson1, "captain");
	
	
	@Test
	public void testgetName() {
		assertEquals("testname", testMarina1.getName());
	}
	
	@Test
	public void testgetAddress() {
		assertEquals("testaddress", testMarina1.getAddress());
	}
	
	@Test
	public void testgetMaxBoats() {
		assertEquals(100, testMarina1.getMaxBoats());
	}
	
	@Test
	public void testgetCurrentBoats() {
		assertEquals(3, testMarina1.getCurrentBoats());
	}
	
	@Test
	public void testgetBoats() {
		testMarina1.addBoat(testBoat1);
		testMarina1.addBoat(testBoat2);
		testMarina1.addBoat(testBoat3);
		assertEquals(3, testMarina1.getBoats().size());
	}

}
