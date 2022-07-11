package inheritance;

class Kid extends Toddler{
/*     |             |
       |             |
(this is subclass)   | 
	 (this is inheritance from another subclass)*/ 
	
	int gradeLevel;//new attributes
	
	Kid(String name, String sex, String favoriteGame, int age, int gradeLevel){
		super(name,sex,favoriteGame,age);
		this.gradeLevel = gradeLevel;
	}
	void drink(){
		System.out.println(name + " is drinking juice");
	}
    void checkStatus() {
		super.checkStatus();
		System.out.println("Grade level : "+ gradeLevel);
  }
}