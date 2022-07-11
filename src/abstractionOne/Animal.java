package abstractionOne;
//this is abstract class it means it is not visible and cannot be instantiate
//to access this class you have to inherit it from another class
abstract class Animal {
	
	private String name;
	
  //the subclass are required to override this method
  //this is abstract method and as you can see it has no body because it is abstract	
	abstract void makeSound();
	
	void showName() {
		System.out.println("Name : "+ name);
	}
	void setName(String name) {
		this.name = name;
	}
	
}