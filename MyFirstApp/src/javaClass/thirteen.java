package javaClass;

import java.util.*;

public class thirteen {
	
	
	
	public static void main(String[] args) {		// TODO Auto-generated method stub
		
		int[] listOfNumbers = {1,13,4,4};
		int[] listOfNumbers2 = {1,13,13,13,4,4};
		int[] listOfNumbers3 = {1,2,2,1};
		int[] listOfNumbers4 = {1,1};
		int[] listOfNumbers5 = {1,2,2,1,13};
		
		sum13(listOfNumbers);
		sum13(listOfNumbers2);
		sum13(listOfNumbers3);
		sum13(listOfNumbers4);
		sum13(listOfNumbers5);
	}
	
	
	static void sum13(int[] newListOfNumbers) {
		
		boolean number_thirteen = false;
		int arrayLength = 0, number=0;
		int total = 0;
		arrayLength = newListOfNumbers.length;
		for (int i=0;i<arrayLength;i++) {
			if (newListOfNumbers[i] != 13 && number_thirteen == false) {
				total += newListOfNumbers[i];
			} else if (newListOfNumbers[i] != 13 || number_thirteen == true) {
				number_thirteen = false;
			} else if (newListOfNumbers[i] == 13) {
				number_thirteen = true;
			}
		}
		System.out.println("The total of the digits is:  " + total);
	}
}
