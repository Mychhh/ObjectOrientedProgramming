package fundamentals;

class User {
//this is Encapsulation topic	
	private int userID, OTP;
	private String userName;
	private String firstName, lastName;
	
	User (int userID, int OTP, String userName, String firstName, String lastName){
		this.userID = userID;
		this.OTP = OTP;
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
	}
/*this is setters 
  which means this is write only */
	void setOTP(int OTP ) {
		this.OTP = OTP;
	}
/*this is getters 		
  which means this is read only*/
	int getuserID() {
		return userID;
	}
/*This is setters and getters
  	which means you can write and read */
	void setuserName(String userName) {
		this.userName = userName;
	}
	void setfirstName(String firstName){
		this.firstName = firstName;
	}
	void setlastName(String lastName) {
		this.lastName = lastName;
	}	
	String getuserName() {
		return userName;
	}
	String getfirstName() {
		return firstName;
	}
	String getlastName() {
		return lastName;
	}
/*If you want to run this code just paste it on the main
 	
 		int userID, OTP;
	    String userName;
		String firstName, lastName;
		
		Scanner s =  new Scanner(System.in);
		System.out.println("Sign up ");
		System.out.print("First Name : ");
		firstName = s.nextLine();
		System.out.print("Last Name  : ");
		lastName = s.nextLine();
		System.out.print("User Name  : ");
		userName = s.nextLine();
		System.out.print("User ID    : ");
		userID = s.nextInt();
		System.out.print("OTP        : ");
		OTP = s.nextInt();
		System.out.println();

		User u = new User(userID, OTP, userName, firstName, lastName);

		String u0Name = u.getuserName();
		String f0Name = u.getfirstName();
		String l0Name = u.getlastName();
		
		System.out.println("User Name  : "+ u0Name);
		System.out.println("First Name : "+ f0Name);
		System.out.println("Last Name  : "+ l0Name);
		
//this is the syntax on how to read an encapsulated class
		System.out.println();
		int id = u.getuserID();
		System.out.println(id);
		System.out.println();
//this is the syntax on how to write an encapsulated class
		u.setOTP(2002);
//this is the syntax on how to read and write an encapsulated class
		u.setuserName("Blind bandit");
		u.setfirstName("Toph");
		u.setlastName("Beifong");
		
		String uName = u.getuserName();
		String fName = u.getfirstName();
		String lName = u.getlastName();
		
		System.out.println("Hello, My name is "
		+ fName +" "+ lName +". and you can also call me "+ uName);
		*/
	
}