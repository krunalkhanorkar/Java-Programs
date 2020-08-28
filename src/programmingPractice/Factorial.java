package programmingPractice;

import java.util.Scanner;

/**
 * @author Krunal
 *
 */
public class Factorial {

	/**
	 * @param args
	 */
	public static int factorial(int n) {
		int fact=1;

		for (int i = 1; i <= n; i++) {
			fact=i*fact;
		}	
		return fact;
	}
	
	public static int factorialReccursion(int no) {
		
		if(no==0 || no==1) {
			return 1;
		}

		return no*factorialReccursion(no-1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("please enter the number for factorial");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.println("factorial with recurssive function =" + Factorial.factorialReccursion(n));
		System.out.println("factorial with normal function =" + Factorial.factorial(n));
	}

}
