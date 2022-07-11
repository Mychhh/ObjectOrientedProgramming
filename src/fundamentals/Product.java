package fundamentals;
//This is Constructors topic	
class Product {
	
	String name;
	float price;
	
//This is how to create constructor
	
	Product(String name, float price){
		this.name = name;
		this.price = price;
//this will automatically print on the main
		System.out.println(name + " Created ");
		System.out.println("PHP. " + price);
	}
/*If you want to run this code just paste it on main
  or create a new instantiation just like the sample below

		Product p = new Product("Milk", 85.25f);
		Product p1 = new Product("Piattos", 14.50f); //Three types of product that I declared
		Product p2 = new Product("Royal", 10.00f);
  	
 */
}
