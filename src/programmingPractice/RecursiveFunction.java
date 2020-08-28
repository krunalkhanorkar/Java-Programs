/**
 * 
 */
package programmingPractice;

import java.util.Scanner;

/**
 * @author KK030
 *
 */
public class RecursiveFunction {

	/**
	 * @param n
	 */
	private static int Reccursivefunc(int n) {
		
		if (n <= 0  ) {
			return 0;
		}
		if (n ==1) {
			return 1;
		}
		return (Reccursivefunc(n-1) + Reccursivefunc(n-2) );
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the value of N >>");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int output = Reccursivefunc(n);
		System.out.println("Output >>> " + output);
	}

	
	

}
