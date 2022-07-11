package srs;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("How many student you want to register : ");
		int numofStudents = s.nextInt();
		s.nextLine();
		System.out.println();
		
		Student students[] = new Student[numofStudents];
	
		for (int i = 0; i < students.length; i++) {
			String fname,lname,course;
			int year = 0;
			char section = 0;

			System.out.println("Enter the credentials of Student #" + (i+1));
			System.out.print("First Name : ");
			fname = s.nextLine();
			
			System.out.print("Last Name  : ");
			lname = s.nextLine();
			
			System.out.print("Course     : ");
			course = s.nextLine();
			
			System.out.print("Year       : ");
			year = s.nextInt();
			s.nextLine();
			
			System.out.print("Section    : ");
			section = s.next().charAt(0);
			s.nextLine();
			
			students[i] = new Student(fname, lname, course, year, section);
			}
		
		for (Student allS : students) {
			allS.studentCredentials();
		}
	
		
	}
}