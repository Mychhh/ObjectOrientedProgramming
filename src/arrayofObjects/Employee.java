package arrayofObjects;

public class Employee {
	
	String firstName, lastName;
	String jobTitle;
	
	Employee(String firstName, String lastName, String jobTitle){
		this.firstName = firstName;
		this.lastName = lastName;
		this.jobTitle = jobTitle;
	}
	void introduce() {
		System.out.println("Name  : "+ firstName +" "+ lastName);
		System.out.println("Title : "+ jobTitle);
		System.out.println();
	}
/*	
	//this is how to make array using class
	Employee employees[] = new Employee[2];
	
	//this is how to store value in array
	employees[0] = new Employee("Michael", "Pabaya", "Student"); 
	employees[1] = new Employee("Mary Joyce", "Fernandez", "Engineer");
	
	//this is how to access value inside an array
	System.out.println(employees[0].firstName);
	
	//this is how to access array using method
	employees[1].introduce();
	
    //iterating arrayofObject using for loop
	for(int i = 0; i < employees.length; i++) {
	    employees[i].introduce();
	}
	
	//iterating arrayofObject using for each loop
	for (Employee e : employees) {
		e.introduce();
	}
*/
	
}