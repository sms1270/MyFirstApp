package javaClass;

public class firstHalf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		firstHalf("Woohoo");
		firstHalf("HelloThere");
		firstHalf("abcdef");
		
	}
	
	static void firstHalf(String input) {
		int inputLength;
		int total_letters = 0;
		inputLength = input.length();
		total_letters = inputLength / 2;
		if (total_letters % 2 == 0) {
			System.out.println("The word does not have an even amount of letters!");
		} else {
			System.out.println(input.substring(0,total_letters));
		}
	}
}
