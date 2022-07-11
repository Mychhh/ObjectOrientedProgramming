package inheritance;

class Sample extends Kid {
	
	String job;
	
	Sample(String name, String sex, String favoriteGame, String job, int age, int gradeLevel){
		super(name, sex, favoriteGame, age, gradeLevel);
		this.job = job;
	}
	void checkStatus() {
		super.checkStatus();
		System.out.println("Job : " + job);
	}

}
