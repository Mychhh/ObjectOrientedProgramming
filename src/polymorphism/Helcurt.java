package polymorphism;

public class Helcurt extends Hero {
	
	Helcurt(){
		name = "Helcurt";
		role = "Assasin";
		lane = "Exp Lane";
		matches = 432;
		wr = 56;
		mmr = 2782;
	}
	void sayDialog() {
		super.stats();
		System.out.println();
        System.out.println("Screeeam.. My prey!");	
        }

}
