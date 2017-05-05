package javaTest;

public class Person {
	
	private String firstName;
	private String surname;
	private String dob;
	private String nationality;
	private String visaInfo = "NA";
	
	
	public Person(String firstName, String surname, String dob, String nationality, String visaInfo) {
		super();
		this.firstName = firstName;
		this.surname = surname;
		this.dob = dob;
		this.nationality = nationality;
		this.visaInfo = visaInfo;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getSurname() {
		return surname;
	}


	public void setSurname(String surname) {
		this.surname = surname;
	}


	public String getDob() {
		return dob;
	}


	public void setDob(String dob) {
		this.dob = dob;
	}


	public String getNationality() {
		return nationality;
	}


	public void setNationality(String nationality) {
		this.nationality = nationality;
	}


	public String getVisaInfo() {
		return visaInfo;
	}


	public void setVisaInfo(String visaInfo) {
		this.visaInfo = visaInfo;
	}
	
	

}
