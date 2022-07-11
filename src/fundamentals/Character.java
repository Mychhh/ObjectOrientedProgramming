package fundamentals;

class Character {
//This is calling object methods topic
	String name, dialog;
	int hp, mp, lvl;
/*this is constructor	
  this is also called method or object because it is inside of our class which is 'public class Character'*/	
	Character (String name, String dialog, int hp, int mp, int lvl){
// 'this' syntax is a constructor		
		this.name = name;
		this.dialog =  dialog;
		this.hp = hp;
		this.mp = mp;
		this.lvl = lvl;
	}
	void introduce () {
		System.out.println("My name is "+ name + " I am level "+ lvl);
	}
	void sayDialog() {
		System.out.println(name +" : "+ dialog);
	}
//this is the example of method with return type.	
	String talkToyou(String firstName) {
		return	name + " : Hello, " + firstName;
	}
//this is overloading method	
	void talkTo(Character x) {
		System.out.println(name + " : Hello, " + x.name);
	}
	void talkTo(String firstName) {
		System.out.println(name + " : Hello, " + firstName);
	}
/*If you want to run this code just paste it on the main
	 
	Character c = new Character("Michael","What the hell",500,20,10);
	Character c1 = new Character("Mary Joyce","What the fuck",250,50,15); 	

//If you want to access any of the attributes of the instantiated class
//just follow this syntax 
    
    String name = c.name;
    System.out.println(name);
    System.out.println();
    
	c.introduce();
	System.out.println();
	
	c.sayDialog();
	System.out.println();
	
	System.out.println(c.talkToyou("Mark"));
	System.out.println();
	
	c.talkTo(c1);
	System.out.println();
	
	c.talkTo("Miguel");
	    
*/
}