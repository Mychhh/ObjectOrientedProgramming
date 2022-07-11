package inheritance;

class Toddler extends Person{
/* |               |     
   |               |
(this is subclass) | 
          (this is inheritance of a superclass)*/  
	
    String favoriteGame; //this is attributes that I add here in subclass
    
//this is overriding constructors	
//note: we are required to call super constructors from super class to add some attributes we needed to subclass  
	Toddler(String name, String sex, String favoriteGame, int age){
		super(name, sex, age);
	    this.favoriteGame = favoriteGame;
	}
	void drink() {
		System.out.println(name +" is drinking milk");
	}
	void checkStatus() {
		super.checkStatus();//I call this super method bacause i still want to retain its attributes
		System.out.println("Favorite Game : "+ favoriteGame);
	}
}