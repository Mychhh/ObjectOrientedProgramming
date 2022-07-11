package srs;

public class Student {
	
	String firstName, lastName;
	String course;
	int year;
	char section;
	
	Student(String firstName, String lastName,  String course, int year, char section){
		this.firstName = firstName;
		this.lastName = lastName;
		this.year = year;
		this.course = course;
		this.section = section;
	}
	void studentCredentials() {
		System.out.println(firstName +" "+ lastName + " from "+ course +" "+ year +" "+ section);
	}

}
