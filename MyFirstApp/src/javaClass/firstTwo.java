package javaClass;

import java.util.Scanner;

public class firstTwo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		firstTwo("Hello");
		firstTwo("abcdefg");
		firstTwo("ab");
		
	}
	
	static void firstTwo(String input) {
		if (input.length() < 2 ) {
			System.out.println("The input is less than two: " + input);
		} else {
			System.out.println(input.substring(0, 2));
		}
		
	}

}
