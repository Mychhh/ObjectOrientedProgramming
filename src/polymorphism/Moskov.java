package polymorphism;

public class Moskov extends Hero {
	
	Moskov(){
		name = "Moskov";
		role = "Marksman";
		lane = "Gold Lane";
		matches = 278;
		wr = 52;
		mmr = 1892;
	}
	void sayDialog() {
		 super.stats();
		 System.out.println();
		 System.out.println("Betrayal taught me a good lesson");	
         }
}