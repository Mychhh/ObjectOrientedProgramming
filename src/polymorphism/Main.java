package polymorphism;
import java.util.*;
public class Main {
//Note: Polymorphism is used to used differentiate every variant of a subject
	public static void main(String[] args) {
		
		System.out.println("This are some Hero from Mobile Legends. Please chose one");
		System.out.println();
		System.out.println("   -------------------------------------------------- ");
		System.out.println("  | Moskov | Chou | Helcurt | Khufra | Pharsa | Nana |");
		System.out.println("   -------------------------------------------------- ");
		System.out.println();
		Scanner s = new Scanner(System.in);
		System.out.print("I choose : ");
		String Hero = s.nextLine();
		
		Hero A = new Moskov();
		Hero B = new Chou();	
		Hero C = new Helcurt();	
		Hero D = new Khufra();	
		Hero E = new Pharsa();	
		Hero F = new Nana();	
		
		if(Hero.equalsIgnoreCase("Moskov")){
			A.sayDialog();
		}else if(Hero.equalsIgnoreCase("Chou")) {
			B.sayDialog();
		}else if(Hero.equalsIgnoreCase("Helcurt")) {
			C.sayDialog();
	    }else if(Hero.equalsIgnoreCase("Khufra")) {
			D.sayDialog();
	    }else if(Hero.equalsIgnoreCase("Pharsa")) {
			E.sayDialog();
	    }else if(Hero.equalsIgnoreCase("Nana")) {
			F.sayDialog();
	    }else {
	    	System.out.println("Invalid Hero");
	    }
		
	 }
}