package abstractionOne;
import java.util.*;
public class Main {
//Abstraction Topic	
//note: abstraction is efficient because you will not forget to override a method
	public static void main(String[] args) {
		
		System.out.println("What do you like ? Cat or Dog?");
		Scanner s =  new Scanner(System.in);
		System.out.println("A) Cat");
		System.out.println("B) Dog");
		System.out.println("C) Both");
		char ans = s.next().charAt(0);
		System.out.println();
		
		Scanner s1 = new Scanner(System.in);
		String cName = null;
		String dName = null;

		  //CONCRETE IDEA	
			Animal c = new Cat();
			Animal d = new Dog();
			
		switch(ans) {
		
		case 'A':
			System.out.println("What name you want for your cat? ");
			System.out.print("Cat name : ");
			cName = s1.nextLine();
			System.out.println();
			c.setName(cName);
			c.showName();
			c.makeSound();
			break;
		case 'B':
			System.out.println("What name you want for your dog? ");
			System.out.print("Dog name : ");
			dName = s1.nextLine();
			System.out.println();
			d.setName(dName);
			d.showName();
			d.makeSound();
			break;
		case 'C':
			System.out.println("What name you want for your cat and dog? ");
			System.out.print("Cat name : ");
			cName = s1.nextLine();
			System.out.print("Dog name : ");
			dName = s1.nextLine();
			System.out.println();
			c.setName(cName);
			d.setName(dName);
			c.showName();
			c.makeSound();
			
			d.showName();
			d.makeSound();

			break;
		default:
			System.out.println("Invalid Letter try again or try to Capslock");
		}

	}
}