package fundamentals;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		sample s =  new sample(1234);
		
		Scanner S = new Scanner(System.in);
		System.out.print("Enter your OTP: ");
		int OTP = S.nextInt();
		
		s.setOTP(OTP);
		

		s.setfirstName("Michael");
		String name = s.getfirstName();
		int userID = s.getuserID();
		
		System.out.println("User ID    : "+ userID);
		System.out.println("First name : "+ name);

}
}