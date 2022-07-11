package zample;
import java.util.*;
public class Main {

	public static void main(String[] args) {
			
		System.out.println("This is Students Grades");
		Scanner s =  new Scanner(System.in);
	    System.out.print("Enter Student Name     : ");
	    String fName = s.nextLine();
	    System.out.print("Enter Grade in Math    : ");
	    float gMath = s.nextFloat();
	    System.out.print("Enter Grade in Science : ");
	    float gScience = s.nextFloat();
	    System.out.print("Enter Grade in English : ");
	    float gEnglish = s.nextFloat();
		
		Grade g = new Grade(fName, gMath, gScience, gEnglish);
		
		g.studentGrade();
		
	}

}
