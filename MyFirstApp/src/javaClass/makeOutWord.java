package javaClass;

import java.util.*;
import java.lang.*;

public class makeOutWord {
	
	static List<String> vowelList = new ArrayList();
	static List<Character> wordList = new ArrayList();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		makeOutWord("<<>>","Yay");
		makeOutWord("<<>>","WooHoo");
		makeOutWord("[[]]","word");
		
		withoutEnd("Hello");
		withoutEnd("java");
		withoutEnd("coding");
		
		extraFront("Hello");
		extraFront("ab");
		extraFront("H");
		
		vowelChecker("Cosa Nostra");
		vowelChecker("Gambino");
		vowelChecker("ppnmwq");

	}
	
	private static void makeOutWord(String outsideWord,String word) {
		System.out.println(outsideWord.substring(0,2) + word + outsideWord.substring(2,4));		
	}
	
	private static void withoutEnd(String word) {
		System.out.println(word.substring(1, word.length()));
	}
	
	private static void extraFront(String word) {
		int a, b;
		if (word.length() < 2) {
			for (a=0; a<3; a++) {
				System.out.println(word);
			}
		} else {
			for (b=0; b<3; b++) {
			System.out.println(word.substring(0,2));
			}
		}
	}
	
	static void vowelChecker(String word) {
		int vowelCount = 0;
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == 'a' 
				|| word.charAt(i) == 'e' 
				|| word.charAt(i) == 'i' 
				|| word.charAt(i) == 'o'
				|| word.charAt(i) == 'u') {
				vowelCount++;
			}
		}
		System.out.println("There are a total of: " + vowelCount + " vowels in the word!"); 
	}
}
	