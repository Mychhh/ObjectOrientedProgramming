package abstractionTwo;
//this is implements and interface topic
public class Main {
//note: abstraction is efficient because you will not forget to override a method
	public static void main(String[] args) {
		
	  //This way of instantiation is much more efficient in abstraction
	  //Because the Dog class will only inherit all the attribute in Animal if we change it to 
	  //this	Animal d = new Dog(); this practice is only efficient in inheritance and Polymorphism 
		Dog d = new Dog();
		Bird b = new Bird();
		Frog f =  new Frog();
		
		d.walk();
		
		b.walk();
		b.fly();
		b.makeSound();
		
		f.swim();
		f.walk();
		

	}

}
