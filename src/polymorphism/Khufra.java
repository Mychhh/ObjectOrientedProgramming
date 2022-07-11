package polymorphism;

public class Khufra extends Hero{
	
	Khufra(){
		name = "khufra";
		role = "Tank";
		lane = "Roaming";
		matches = 102;
		wr = 62;
		mmr = 1721;
	}
	void sayDialog() {
		super.stats();
		System.out.println();
        System.out.println("The whole world is mine, except for you");	
        }

}
