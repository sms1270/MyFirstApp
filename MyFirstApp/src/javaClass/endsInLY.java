package javaClass;

public class endsInLY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub;
				
		// call method
		endsLY("oddly");
		endsLY("y");
		endsLY("oddy");
	}
	
	private static boolean endsLY(String string) {
		boolean result = false;
		//control statement to confirm string is 2 or greater.
		if (string.length() > 1) {
			// convert to lowercase.
			String newString = string.toLowerCase();
			System.out.println(newString);
		
			// extract last 2 digits
			String newNewString = newString.substring(string.length() - 2);
			System.out.println(newNewString);
		
			// if last 2 digits equal ly, return true
			if (newNewString == "ly") {
				result = true;
			} else {
				result = false;
			}
		}	
		return result;
	}
}
