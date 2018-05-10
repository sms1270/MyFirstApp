package javaClass;

import java.util.Scanner;
import java.util.*;
import java.lang.*;


public class checkPassword {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		// password = "aBc23fgHil";
		 
		// inputPassword();
		
		inputPassword();
		
	}
	
	private static void inputPassword() {
		
		int passwordLength = 0;
		inputString s = new inputString();
		String password = s.inputString();
		
		passwordLength = password.length();
		
		if (passwordLength > 10) {
			System.out.println("Your password is wrong.");
			password = s.inputString();
		}
		String newPassword = password.toLowerCase();
		
		checkPassword(newPassword);
		
	}
	
	private static void checkPassword(String newPassword) {
		
		int letter=0,digit=0,number=0, total=0;
		for (int i=0; i<10; i++) {
			
			if (Character.isLetter(newPassword.charAt(i))) {
				letter += 1;
			} else if (Character.isDigit(newPassword.charAt(i))) {
				number += 1;
			}
			total = letter + number;
		}
		if ((letter == 8) && (number == 2)) {
			System.out.println("Successful Login!!");
		} else {
			System.out.println("Your password does not match.  Please re-enter:");
		}
		
		
	}
}
		

			
