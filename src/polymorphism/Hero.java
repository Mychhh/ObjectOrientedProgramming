package polymorphism;
//superclass
public class Hero {
	
	String name, role, lane;
	int matches, wr, mmr;

	void sayDialog() {
		System.out.println("Overide this method");
	}
	void stats() {
		System.out.println("Hero Name        : " + name);
		System.out.println("Role             : " + role);
		System.out.println("Lane             : " + lane);
		System.out.println("Matches          : " + matches);
		System.out.println("Winrate          : " + wr );
		System.out.println("Matchmaking rate : " + mmr );
		}	
}