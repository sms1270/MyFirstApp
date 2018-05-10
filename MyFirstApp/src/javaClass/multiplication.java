package javaClass;

public class multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// create a new object to input an integer using scanner;
		
		input s = new input();
		int number = s.input();
		
		// multiplication method;
		multiplyNumber(number);

	}
	
	
	private static void multiplyNumber(int number1) {
		
		for (int i=0;i<11;i++) {
			// multiple number by i and print
			System.out.println(number1 + " X " + i + " = " + number1*i);
			
		}
	}

}
