package day7;

import java.util.*;

public class commonElements {

	static List<String> elementList = new ArrayList();
	static List<String> elementList2 = new ArrayList();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] array1 = { "Joe", "Jack", "June", "Jean", "Beano", "Booya" };
		String[] array2 = { "Jo", "ack", "une", "ean", "Bano", "Booya" };
		
		List<String> elementList = Arrays.asList(array1);
		List<String> elementList2 = Arrays.asList(array2);
		
		findElement(elementList, elementList2);
		
		} 
	
		static String findElement(List<String> elementList, List<String> elementList2) {
		String result = null;
		Iterator<String> somethingElse = elementList.iterator();
		while (result == null && somethingElse.hasNext()) {
			String current = somethingElse.next();
			elementList.contains(current);
			if (elementList2.contains(current)) {
				System.out.println("Match: " + current);
				result = current;
			}
				
		}
		return result;
	}

}
