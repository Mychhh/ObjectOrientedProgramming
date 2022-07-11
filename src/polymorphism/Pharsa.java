package polymorphism;

public class Pharsa extends Hero{
	
	Pharsa(){
		name = "Pharsa";
		role = "Mage/Support";
		lane = "Mid Lane";
		matches = 89;
		wr = 56;
		mmr = 1692;
	}
	void sayDialog() {
		super.stats();
		System.out.println();
        System.out.println("Revenge has blinded me");	
        }

}
