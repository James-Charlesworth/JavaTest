package javaTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class PersonTest {

	//test all getters
	
	
	@Test
	public void testgetFirstName() {
		Person testPerson1 = new Person("testfirstname","testsurname","00/00/0000","testnationality", "testvisainfo");
		assertEquals("testfirstname", testPerson1.getFirstName());
	}
	
	@Test
	public void testgetSurname() {
		Person testPerson1 = new Person("testfirstname","testsurname","00/00/0000","testnationality", "testvisainfo");
		assertEquals("testsurname", testPerson1.getSurname());
	}
	
	@Test
	public void testgetDob() {
		Person testPerson1 = new Person("testfirstname","testsurname","00/00/0000","testnationality", "testvisainfo");
		assertEquals("00/00/0000", testPerson1.getDob());
	}
	
	@Test
	public void testgetNationality() {
		Person testPerson1 = new Person("testfirstname","testsurname","00/00/0000","testnationality", "testvisainfo");
		assertEquals("testnationality", testPerson1.getNationality());
	}
	
	@Test
	public void testgetVisaInfo() {
		Person testPerson1 = new Person("testfirstname","testsurname","00/00/0000","testnationality", "testvisainfo");
		assertEquals("testvisainfo", testPerson1.getVisaInfo());
	}

}
