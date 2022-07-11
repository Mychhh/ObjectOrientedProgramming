package fundamentals;

class Class {
// This is Object Methods topic and we also talk about Constructor
	String firstName, lastName, course;
	int year; 
	float midtermGrade, finalGrade;
	char section;
	                                              //Parameter
	Class(String firstName, String lastName, String course, int year, char section, float midtermGrade, float finalGrade){
//'this' is how to create constructor		
		this.firstName = firstName;
		this.lastName = lastName;
		this.course = course;
		this.year = year;
		this.section = section;
		this.midtermGrade = midtermGrade;
		this.finalGrade = finalGrade;
	}
	//Method
	void introduceSelf(){
		System.out.println("Hello, "+ firstName +" "+ lastName +" from "+ course +"-"+ year + section);
	}
	//Method
	void evaluateGrade() {
		float average =  ((midtermGrade + finalGrade)/2);
		String remarks;
		
		if (average > 100) remarks = "Invalid Grade";
		else if(average >= 98) remarks = "With Highest Honors";
		else if(average >= 95) remarks = "With High Honors";
		else if(average >= 90) remarks = "With Honors";
		else if(average >= 75) remarks = "Passed";
		else remarks = "Failed";
		
		System.out.printf("Your average is %.2f", average);
		System.out.print(" "+ remarks);//find solution to this code
		}	
/*If you want to run this code just paste it on the main
 		String firstName, lastName, course;
		int year; 
		float midtermGrade, finalGrade;
		char section;
		
		Scanner s =   new Scanner(System.in);
		System.out.println("Hello Student Please enter your credentials");
		System.out.print("First name    : ");
		firstName = s.nextLine();
		System.out.print("Last name     : ");
		lastName = s.nextLine();
		System.out.print("Course        : ");
		course = s.nextLine();
		System.out.print("Year          : ");
		year = s.nextInt();
		System.out.print("Section       : ");
		section = s.next().charAt(0);
		System.out.print("Midterm Grade : ");
		midtermGrade = s.nextFloat();
		System.out.print("Final Grade   : ");
		finalGrade = s.nextFloat();
		
		
		
        Class c =  new Class(firstName,lastName,course,year,section,midtermGrade,finalGrade);
    
        c.introduceSelf();
        c.evaluateGrade();
 */
}