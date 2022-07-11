package abstractionTwo;
                            /*as you can see here i did not implement the LandAnimal interface
                              because I extend LandAnimal to AirAnimal
                              That is why AirAimal will inherit all the value in the LandAnimal*/
public class Bird implements Animal,AirAnimal{

	public void makeSound() {
		System.out.println("Chirp!");
	}
	public void fly() {
		System.out.println("Flying!");
	}
	public void walk() {               //I override this method without error
		System.out.println("Walking!");//because the LandAnimal is extended in AirAnimal
	}

}
