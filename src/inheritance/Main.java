package inheritance;

public class Main {
//note: inheritance is efficient to make sure that you will inherit all the attributes in the superclass
	public static void main(String[] args) {
	
	  //This way of instantiation is much more efficient in inheritance	
 		Person p = new Person("Michael", "Male", 19);
		Person t = new Toddler("Mary Joyce","female","ABC",1);
		Person k = new Kid("Mark","Male","Mobile Legends", 10, 7);
		Person s = new Sample("Miguel", "Male", "COD", "Engineer", 27, 12);
		
		p.checkStatus();
		System.out.println();
		t.checkStatus();
		System.out.println();
		k.checkStatus();
		System.out.println();
		
		s.checkStatus();


	}
}
