package fundamentals;

class sample {
	
	//this is Encapsulation topic	
		private int userID, OTP;
		private String userName;
		private String firstName, lastName;
		
	sample(int userID){
		this.userID = userID;
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
}