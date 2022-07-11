package polymorphism;

public class Chou extends Hero {
	
	Chou(){
		name = "Chou";
		role = "Fighter/Assasin";
		lane = "Gold Lane";
		matches = 667;
		wr = 52;
		mmr = 2039;
	}
	void sayDialog() {
		super.stats();
		System.out.println();
        System.out.println("Knowing is not enough, we must apply");	
        }
}