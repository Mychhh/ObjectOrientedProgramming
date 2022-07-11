package fundamentals;
//This is overloading constructors topic
class Employee {

//This are global variables
    String firstName, lastName;
    String title, adress, sex;    //This are attributes || Global Variables
    int age;
	
//this is overloading constructors. As you can see they are the same class name but different arguments
// (ClassName)(                                  ARGUMENTS                                        )
    Employee (String firstName, String lastName, String title, String adress, String sex, int age ){
    	this.firstName = firstName;
    	this.lastName = lastName;
    	this.title = title;
    	this.adress = adress;
    	this.sex = sex;
    	this.age = age;
    }
// (ClassName)(            ARGUMENTS                     )             
    Employee (String firstName, String lastName, int age ){
    	this.firstName = firstName;
    	this.lastName = lastName;
    	this.age = age;
    }
// (ClassName)(No Arguments)    
    Employee (){
    	firstName = "N/A";
    	lastName = "N/A";
    	title = "N/A";
    	adress = "N/A";
    	sex = "N/A";
    	age = 0;
    }
    //Method 
    void IntroduceAll() {
    	System.out.println("Hello this is my application");
    	System.out.println("My Name is "+ firstName +" "+ lastName +" from "+ adress +" "+ title +". I am "+ sex +" "+ age +" years old" );
    }
    //Method
    void IntroduceHalf() {
    	System.out.println("Hello this is my application");
    	System.out.println("My name is "+ firstName +" "+lastName +". " + age +"years old");
    }
    //Method
    void IndtroduceNothing(){
    	System.out.println("First Name : "+ firstName);
    	System.out.println("Last Name  : "+ lastName);
    	System.out.println("Title      : "+ title);
    	System.out.println("Adress     : "+ adress);
    	System.out.println("Sex        : "+ sex);
    	System.out.println("Age        : "+ age);
    }
/*If you want to run this code just paste it to the main
 
		String firstName, lastName;
		String title, adress, sex;
		int age;
				
			Scanner s = new Scanner(System.in);
			System.out.println("This is Application Form");
			System.out.println("Fill out all the Box and just skip if not applicable ");
			System.out.println();
			System.out.print("First Name : ");
			firstName = s.nextLine();
			System.out.print("Last Name  : ");
			lastName = s.nextLine();
			System.out.print("Title      : ");
			title = s.nextLine();
			System.out.print("Adress     : ");
			adress = s.nextLine();
			System.out.print("Sex        : ");
			sex = s.nextLine();
			System.out.print("Age        : ");
			age = s.nextInt();
			System.out.println();
			
	      //I made this array to store all the parameter needed to the class. Except age, because the data types of age is int
			String[] allString = {firstName,lastName,title,adress,sex};			
		
// This is Instantiation of a class    (In this are will store all the parameter needed) parameter,argument or what so ever you call it	
			Employee e =  new Employee(firstName,lastName,title,adress,sex,age);
			Employee e1 = new Employee(firstName,lastName,age);
			Employee e2 = new Employee();
			
          //This is the number of index of allString			
			int UI = allString.length;		
		  //This will iterate the all value inside the arrays
			for (int row = 0; row < allString.length; row++) {
			    if(allString[row].length() == 0) UI --;		       
		}//this will print all the info needed
			if      (UI+1 == 6) e.IntroduceAll();
		 //this will print only name and age of the user because they did not fill out all the forms	
			else if (UI+1 == 3 )e1.IntroduceHalf();
		 //this will print N/A because user did not fill out the form except age
			else                e2.IndtroduceNothing();		 
 */
}
