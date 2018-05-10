package javaClass;

import java.util.*;
import java.lang.*;

public class sumOfArray {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] listOfNums1 = {1,2,2,1};
		int[] listOfNums2 = {1,1};
		int[] listOfNums3 = {1,2,2,1,13}; 
		// sum13 ({1,13,13,13,4,4})
		
		// sum13(listOfNums1);
		// sum13(listOfNums2);
		// sum13(listOfNums3);
		sum13({1,13,4,4});

		int[] evenNumbers1 = {2,1,2,3,4};
		int[] evenNumbers2 = {2,2,0};
		int[] evenNumbers3 = {1,3,5};
		
		// countEvens(evenNumbers1);
		// countEvens(evenNumbers2);
		// countEvens(evenNumbers3);
		
		System.out.println("Enter an integer... ");
		Scanner in = new Scanner(System.in);
		int arrayLength = in.nextInt();
		
		
		// fizzArray(arrayLength);

	}
	
	static void sum13(int[] listOfNumbers) {
		
		boolean thirteen = false;
		int total = 0;
		int i = 0;
		int numLength = listOfNumbers.length;
		
		for (i=0;i<numLength;i++) {
			if (listOfNumbers[i] == 13) {
				thirteen = true;
			} else if (thirteen == true){
				continue;
				total = total + listOfNumbers[i];
				
			}	
			
		}
		System.out.println("The total is:  " + total);
		
	}
	
	static void countEvens(int[] listOfEvens) {
		
		int total = 0;
		int numLength = listOfEvens.length;
		for (int i=0;i<numLength;i+=2) {
			if (listOfEvens[i] % 2 == 0) {
				total += 1;
			} else {
				continue;
			}
		}
		System.out.println("The total integers that are even is:  " + total);
	}
	
	static void fizzArray(int lengthOfArray) {
		
		int[] numberArray = new int[lengthOfArray];
		
		if (lengthOfArray < 1) {
			System.out.println("The number you entered is 0..  Terminating...");
			System.exit(0);
		} else {
			for (int i=1;i<lengthOfArray;i++) {
				numberArray[i] = i;
			}
		}
			System.out.println(Arrays.toString(numberArray));
	}
}	
