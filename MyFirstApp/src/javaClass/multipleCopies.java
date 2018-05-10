package javaClass;

public class multipleCopies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Call methods
		stringTimes("Hi",2);
		stringTimes("Hi",3);
		stringTimes("Hi",1);
	}
	
	private static void stringTimes(String string1, int repeat) {
		// repeat n times
		// if repeat = n-1 new line
		// Print output
		for (int i=0;i<repeat;i++) {
			if (i == (repeat - 1)) {
				System.out.println(string1);
			} else {
				System.out.print(string1);
			}
		}

	}

}
