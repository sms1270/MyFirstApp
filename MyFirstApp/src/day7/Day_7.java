package day7;

import java.util.Scanner;

public class Day_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int month = 0;
		System.out.println("Enter a number between 1 and 12:  ");
		Scanner in = new Scanner(System.in);
		month = in.nextInt();
			
		monthOfYear(month);
		
		icyHot(120,-1);
		icyHot(-1,120);
		icyHot(2,120);
		
		posNeg(1,-1,false);
		posNeg(-1,1,false);
		posNeg(-4,-5,true);
	}
	
	
	static void icyHot(int x,int y) {
		boolean yesOrNo;
		if ( ( (x < 0) && (y > 100) ) || ( (y < 0) && ( x > 100) ) ) {
			yesOrNo = true;
			System.out.println(yesOrNo);
		} else {
			yesOrNo = false;
			System.out.println(yesOrNo);
			System.out.println();
			System.out.println();
		}
	}
	
	
	static void posNeg(int x,int y,boolean z) {
		boolean yesOrNo;
		if (z == true) {
			if ( (x < 0 ) && (y < 0 ) ) {
				yesOrNo = false;
				System.out.println(yesOrNo);
			} 
		}
		if ( z == false) {
			if ( ( (x < 0) && (y > 0) ) || ( (y < 0 ) && (x > 0) ) ) {
				yesOrNo = true;
				System.out.println(yesOrNo);
			}
		}
	}
	
	
	static void monthOfYear(int mon) {
		String[] entry = {
				"Entry is wrong",
				"January",
				"February",
				"March",
				"April",
				"May",
				"June",
				"July",
				"August",
				"September",
				"October",
				"November",
				"December"
		};
		if (mon < 0 && mon > 12 ) {
			System.out.println(entry[0]);
		} else {
			System.out.println(entry[mon]);
		}
	}
}
