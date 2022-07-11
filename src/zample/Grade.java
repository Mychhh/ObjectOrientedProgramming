package zample;

class Grade {
	
	String fullName;
    float gradeinMath, gradeinScience, gradeinEnglish;
	
	Grade(String fullName, float gradeinMath, float gradeinScience, float gradeinEnglish){
		this.fullName = fullName;
		this.gradeinMath = gradeinMath;
		this.gradeinScience = gradeinScience;
		this.gradeinEnglish = gradeinEnglish;
	}
	void studentGrade() {
		
	    float Avg = ((gradeinMath + gradeinScience + gradeinEnglish)/3);
		
		System.out.println("Student Name  : " + fullName);
		System.out.printf("Average Grade : %.2f", Avg);
	}

}
 