package javaClass;

public class firstCharConcatenation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// initialize variables
		
		// Call method using the hardcoded parameters
		nonStart("Hello","There");
		nonStart("java","code");
		nonStart("shotl","java");

	}
	
	private static void nonStart(String string1, String string2) {
		
		// use substring to remove first char on each word
		String newString1 = string1.substring(1);
		String newString2 = string2.substring(1);
		// Print output
		System.out.println("The new word is: " + newString1 + newString2);
	}

}
