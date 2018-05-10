package javaClass;

public class blackjack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Call method
		blackjack(19,21);
		blackjack(21,19);
		blackjack(19,22);
		blackjack(5,0);
		blackjack(22,23);
		

	}
	
	private static int blackjack(int num1, int num2) {
		int result = 0;	
		// Given 2 values greater than 0.  Return the value closest to 21 without going over.
		// Confirm numbers are greater than 0. 
		if (num1 > 0 && num2 > 0) {
			result = Math.max(num1, num2);
		}
		// Check results of math.max
		if (result <= 21) {
			System.out.println(result);
		} else if (Math.min(num1, num2) <= 21) {
			result = Math.min(num1, num2);
			System.out.println(result);
		} else if (num1 > 21 && num2 > 21) {
			result = 0;
			System.out.println(result);
		}
		
		return result;
	}

}
