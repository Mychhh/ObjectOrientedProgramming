package polymorphism;

public class Nana extends Hero {
	
	Nana(){
		name = "Nana";
		role = "Support/Mage";
		lane = "Mid Lane";
		matches = 72;
		wr = 50;
		mmr = 1210;
	}
	void sayDialog() {
		super.stats();
		System.out.println();
        System.out.println("Mama told me not to judge others");	
        }
}
