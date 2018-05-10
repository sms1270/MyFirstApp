package javaClass;

import java.util.*;
import java.lang.*;

public class doesItContain {
	
	static List<String> elementList = new ArrayList();
	static List<String> elementList2 = new ArrayList();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] checklist = {1,4};
		Integer[] numbers1 = {1,2,3};
		Integer[] numbers2 = {1,2,3,4};
		Integer[] numbers3 = {2,3,4};
		
		List<Integer> elementList = Arrays.asList(checklist);
		List<Integer> elementList2 = Arrays.asList(numbers1);
		List<Integer> elementList3 = Arrays.asList(numbers2);
		List<Integer> elementList4 = Arrays.asList(numbers3);
		
		//call method
		no14(elementList, elementList2);
		no14(elementList, elementList3);
		no14(elementList, elementList4);

	}
	
	static void no14(List<Integer> elementList, List<Integer> elementList2) {
		String result = null;
		boolean yesOrNo = false;
		Iterator<Integer> checker = elementList.iterator();
		while (result == null && checker.hasNext()) {
			String current = checker.next().toString();
			elementList.contains(current);
			
			if (elementList2.toString().contains(current)) {
				System.out.println("Match: " + current);
				result = current;
				yesOrNo = true;
				System.out.println(yesOrNo);
			} 
		}
	}
}


	

