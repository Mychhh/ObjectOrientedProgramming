package arrayList;
//array list has no limitation
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
/*		
	//PRIMITIVE DATA TYPES
		int q;
		float w;
		double e; //usually primitive data types is predefined 
		char r;
		boolean t;
		byte y;
		
		
	//NON-PRIMITIVE DATA TYPES
		String u;   
		Student i;   //non-primitive data types can have methods not unlike primitive data types
		
	//WRAPPER CLASS
		Integer a;
		Float s;
		Double d; 
		Character f;  //We need this wrapper class to make primitive data types to a non-primitive data types 
		Boolean g;
		Byte h;
*/		
		//Array list using String
		ArrayList <String> names = new ArrayList<String>();
		names.add("Michael");
		names.add("Mary Joyce");// Writing Values in Array list
		names.add("Miguel");
		names.add("Mark");
		
		int nameSize = names.size();
		
		System.out.println(nameSize);//Accesing size of an arraylist
		System.out.println("Array size " + names.size());
		
		System.out.println();//Space
		
		System.out.println(names.get(0));// Reading Values in Array list  
		names.set(0,"Pabaya");//Updating Values in Array list
		System.out.println(names.get(0));// Reading Updated Values in Array list  

		System.out.println();//Space
		
		names.remove(2);// Removing Values in Array list
		System.out.println(names.get(2));// We remove the name miguel that is why the name mark will be replace
		
		names.clear();// This will Clear all our value in array list
		
        System.out.println(); // Another sample		
		
        //Array list using int
		ArrayList <Integer> numbers = new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);// Writing Values in Array list
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);
		
        int numbersSize = numbers.size();
		
		System.out.println(numbersSize); //Accesing size of an arraylist
		System.out.println("Array size " +numbers.size());
		
		System.out.println();//Space
		
		int num = numbers.get(0);
		System.out.println(num);// Reading Values in Array list  
		
		System.out.println();//Space
		
		numbers.remove(3);
		System.out.println(numbers.get(3)); // We remove the value in index 3 that is why the value will be replace by the value in index 4
		
		numbers.clear();// This will Clear all our value in array list
		
		System.out.println(); // Another sample	
		
		//Array list using class
		ArrayList <Student> students = new ArrayList<Student>();
		students.add(new Student("Michael","BSIT"));
		students.add(new Student("John Paul","BSIT"));
		students.add(new Student("Reynaldo ","BSIT"));// Writing Values in Array list
		students.add(new Student("Liniel","BSIT"));
		students.add(new Student("Ronald Llurag","BSIT"));
		 
        int studentsSize = students.size();
		
		System.out.println(studentsSize); //Accesing size of an arraylist
		System.out.println("Array size " +students.size());
		
		System.out.println();//Space
		
		Student s = students.get(0);
		s.introduce();              // Reading Values in Array list  
		
		System.out.println();//Space
		
		students.get(1).introduce();
		
		System.out.println(); // Another sample	
		
		students.set(1, new Student("Mary Joyce", "BSCPE"));
		students.get(1).introduce();
		
		System.out.println(); // Another sample	
		
		students.remove(3);
		students.get(3).introduce(); // We remove the value in index 3 that is why the value will be replace by the value in index 4
		
		students.clear();// This will Clear all our value in array list

	}
}