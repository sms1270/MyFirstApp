package javaClass;

public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=0,b=0,c=0;
		calculateSum(a,b,c);
		calculateDifference(a,b,c);
		calculateProduct(a,b,c);
		calculateDivision(a,b,c);

	}
	
	public static int calculateSum(int a_diff,int b_diff,int c_diff) {
		int total_sum = b_diff + a_diff;
		System.out.println("The sum is " + total_sum);
		return 0;
	}
	
	public static int calculateDifference(int a_difference, int b_difference, int c_difference) {
		int total_difference = b_difference - a_difference;
		System.out.println("The difference is " + total_difference);
		return 0;
		}
	
	public static int calculateProduct(int a_product, int b_product, int c_difference) {
		int total_product = b_product * a_product;
		System.out.println("The product is " + total_product);
		return 0;
		}
		
	public static int calculateDivision(int a_division, int b_division, int c_difference) {
		int total_division = b_division / a_division;
		int total_remainder = b_division % a_division;
		if ( total_remainder == 0) {
			System.out.println("The dividend is " + total_division);
		}
		else {
			System.out.println("The dividend is " + total_division);
			System.out.println("The remainder is " + total_remainder);
		}
		
		return 0;
		}

}
