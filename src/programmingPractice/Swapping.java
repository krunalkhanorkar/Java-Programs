/**
 * 
 */
package programmingPractice;

import java.util.Scanner;

/**
 * @author krunal
 *
 */
public class Swapping {

	/**
	 * @param args
	 */
	
	private static void swapNo(int no1, int no2) {
		no1= no1+no2;
		no2= no1-no2;
		no1= no1-no2;
		System.out.println("After Swapping");
		System.out.println( no1 + "		" + no2);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two numbers to be swapped");
		int no1= scanner.nextInt();
		int no2= scanner.nextInt();
		System.out.println("Before Swapping");
		System.out.println( no1 + "		" + no2);
		swapNo(no1,no2);
	}
}
