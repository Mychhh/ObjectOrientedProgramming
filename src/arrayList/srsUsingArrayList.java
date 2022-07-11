package arrayList;

public class srsUsingArrayList {
	
	String firstName, lastName;
	String course;
	int year;
	char section;
	
	srsUsingArrayList(String firstName, String lastName, String course, int year, char section){
		this.firstName = firstName;
		this.lastName = lastName;
		this.course = course;
		this.year =  year;
		this.section =  section;		
	}
	void studentCredentials() {
		System.out.println();
		System.out.println(firstName +" "+ lastName + " from "+ course +" "+ year +" "+ section);
	}
	
}
