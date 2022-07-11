package fundamentals;

//This is Constructors topic

class Individual {

	String firstName;
	String lastName;
	int age;
	char sex;
		Individual(String firstName, String lastName, int age, char sex){
		this.firstName = firstName;
		this.lastName = lastName;
		this.age  = age;
		this.sex = sex;
//this will automatically print on the main	
		System.out.println("Hello my name is "+ firstName +" "+ lastName +", I am "+ age +" years old. My sex is "+ sex);		
	}

/*If you want to run this code just paste it on main
  or create a new instantiation just like the sample below

        Individual i = new Individual("Michael","Pabaya",19,'M');
 */
}
