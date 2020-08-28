/**
 * 
 */
package programmingPractice;

import java.util.Scanner;


/**
 * @author Krunal
 *
 */
public class PrimeNumbers {

	/**
	 * @param args
	 */

	private static void PrintAllPrimeNos(int num) {
		// TODO Auto-generated method stub
		if (num>= 2) {
			for (int i = 2 ; i <= num; i++) {
			int flag =0;
			for (int j = 2; j <= i/2; j++) {
				if(i%j==0) {
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.print(i + "	");
			}
			}
		}
		else {
			System.out.println("enter a valid number");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter a number to find all the prime numbers :");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		scanner.close();
		PrintAllPrimeNos(num);
	}
}