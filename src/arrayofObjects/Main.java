package arrayofObjects;

public class Main {

	public static void main(String[] args) {
                               //length || size always start in 1       		
		Student students[] = new Student[3];
      //index always start in 0
		students[0] = new Student("Michael DR. Pabaya", "BSIT", 2, 123);
		students[1] = new Student("John Paul Diongzon", "BSIT", 2, 456);
		students[2] = new Student("Liniel Bartolome"  , "BSIT", 2, 789);
		
	  //iterating array of objects using for each loop
		for(Student s : students) {
			s.introduce();
			System.out.println();
		}
	  //iterating array of objects using for loop	
        for(int i = 0; i < students.length; i++) {
            students[i].introduce();
        }
	}
}