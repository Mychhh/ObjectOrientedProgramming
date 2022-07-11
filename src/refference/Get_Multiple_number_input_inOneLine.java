package refference;

import java.util.Scanner;

public class Get_Multiple_number_input_inOneLine {

	public static void main(String[] args) {
		
		Scanner s =  new Scanner(System.in);
		System.out.println("Enter Integers : ");
		String sampleString = s.nextLine();
		//To scan integers separated with whitespace from a single line input
		
		String [] stringArrays = sampleString.split("\\s+");
		//To split integers from white spaces & storing it in a string array
		
		int[] intArray = new int[stringArrays.length];
		//declaring int arrays to store int from string array

		for (int i = 0; i < stringArrays.length; i++) {
			
			String numberAsString = stringArrays[i];
			//Creating dummy string for storing int from string array
			
			intArray[i] = Integer.parseInt(numberAsString);
			
			System.out.println(intArray[i]);
			System.out.println(intArray.length);
			
		}

	}

}
