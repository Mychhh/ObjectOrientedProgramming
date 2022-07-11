package arrayofObjects;

public class Student {
	
	String fullName;
	String course;
	int year,IDnum;
	
	Student(String fullName, String course, int year, int IDnum){
		this.fullName = fullName;
		this.course = course;
		this.year = year;
		this.IDnum = IDnum;
	}
	void introduce(){
		System.out.println("Name   : "+ fullName);
		System.out.println("Course : "+ course);
		System.out.println("Year   : "+ year);
		System.out.println("ID num : "+ IDnum);
	}

}
