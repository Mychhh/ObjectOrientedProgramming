package fundamentals;

class Gadget {

//This is Constructors topic
	String brandofGadget;
	String typeofGadget; //Attributes || Global Variable 
	int ageofGadget;
                            	//Parameter
	Gadget(String brandofGadget, String typeofGadget, int ageofGadget){ 
		this.brandofGadget = brandofGadget;
		this.typeofGadget = typeofGadget;
		this.ageofGadget = ageofGadget;
		    
	        //Argument	
		if (ageofGadget <= 1 ) System.out.println("Hello "+ brandofGadget +" user, your "+ typeofGadget + " is brand new enjoy it while you can :D" );
		else System.out.println("Hello, "+ brandofGadget +" user your "+ typeofGadget + " is too old :D" );
	}		
/*If you want to run this code just paste it on the main
 
		System.out.println("Hello user, please fill out the information below");
		Scanner s = new Scanner(System.in);
		System.out.print("Brand of your gadget : ");
		String brand = s.nextLine();
		System.out.print("Type of your gadget : ");
		String type = s.nextLine();
		System.out.print("How many year/s you are using your gadget : ");
		int age = s.nextInt();
		
		System.out.println();
		Gadget g = new Gadget(brand, type, age); //I instantiate this class using Scanner which is the value are from the user

Ginagamit po ung this pag same po ung name ng 
Global Variable at ng Parameter ^_^

for example po

string name;

void setName(string name){
     this.name = name;
}

ung this.name po tinutukoy po niya is ung global variable ung nasa labas po nung setName()

tapos po ung name lang un po ung parameter na hinihingi ni name ^_^		*/
	
}
