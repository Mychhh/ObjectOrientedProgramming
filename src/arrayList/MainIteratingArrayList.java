package arrayList;

import java.util.ArrayList;
//linkded list is unlimited
public class MainIteratingArrayList {

	public static void main(String[] args) {

		ArrayList <String> names = new ArrayList<String>();
		names.add("Michael");
		names.add("Mary Joyce");// Writing Values in Array list
		names.add("Miguel");
		names.add("Mark");
		
		//for loop
		for(int i = 0; i < names.size(); i++) {
			System.out.println("Name #" + (i+1) + " : "+ names.get(i));
		}
		
		System.out.println(); // Another sample	

		ArrayList <Integer> numbers = new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);// Writing Values in Array list
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);
		
		//for each loop
		for(int num : numbers) { //num will represents the element of numbers which is arraylist
			System.out.println(num);
		}
		
		System.out.println(); // Another sample	
		
		ArrayList <Student> students = new ArrayList<Student>();
		students.add(new Student("Michael","BSIT"));
		students.add(new Student("John Paul","BSIT"));
		students.add(new Student("Reynaldo ","BSIT"));// Writing Values in Array list
		students.add(new Student("Liniel","BSIT"));
		students.add(new Student("Ronald Llurag","BSIT"));
		
		//for each loop
		for(Student s : students) { 
			s.introduce();
		}
		
		System.out.println("-----------------------------------"); // Space
		
		//for loop
		for(int i = 0; i < students.size(); i++) {
			students.get(i).introduce();
		}

	}

}
