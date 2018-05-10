package javaClass;

import java.util.Scanner;

public class inputString {

	public static String inputString() {
		// TODO Auto-generated method stub
		
		String stringInput;
		System.out.println("Enter your password.  Your password must be at least 10 digits... ");
		Scanner in = new Scanner(System.in);
		stringInput = in.next();
	    
		// input1 = in.nextString();
		
		return stringInput;
		
		

	}

}
