package inheritance;
//this is super class	
class Person {

	String name, sex; //attributes
	int age;

//this is explicit constructors because it has nothing arguments
    Person(){
/*this technique can be use if you dont want to call a  superclass or you dont want to use overriding method in a subclass    	
  but of course it has a consequence*/
    }	
//this is implicit constructors because it has arguments   
	Person(String name, String sex, int age){
		this.name = name;
		this.sex =  sex;
		this.age = age;
	}
	void checkStatus() {
		System.out.println("Name :"+  name);
		System.out.println("Sex  :"+  sex);
		System.out.println("Age  :"+  age  );
	}
}