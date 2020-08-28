/**
 * 
 */
package programmingPractice;

import java.util.Scanner;

/**
 * @author KK030
 *
 */
public class StringPalindrome {
	
	public static void palindrome(String stringArray) {
		
		StringBuffer str  = new StringBuffer(stringArray);

			if (str.reverse() == str) {
				System.out.println("the string entered is palindrome >> " + str);
			}
			else {
				System.out.println("the string entered is not palindrome >>");
				}
		}

	public static String [] FindPalindrome( String [] stringArray) {
		String outputArray [] = new String[stringArray.length];
		
		
		for (int i = 0; i < stringArray.length-1; i++) {
			for (int j = i+1; j < stringArray.length; j++) {
				
				if (stringArray[i]== stringArray[j]) {
					
				}
			}
			
		}
		
		return null;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the array length");
		Scanner scanner = new Scanner(System.in);
		int no = scanner.nextInt();
		String stringArray [] = new String[no];
		
		for (int i = 0; i < no; i++) {
			System.out.println("Enter strings" );
			stringArray[i] = scanner.next();
		}
		System.out.println();
		System.out.println("<<String Current Array >>");
		for (int i = 0; i < stringArray.length; i++) {
			System.out.print( "'"+stringArray[i] + "'	");
			
		}
		System.out.println();
		
		if (stringArray.length ==1) {
			System.out.println("Array has only one string " );
			System.out.println();
			palindrome(stringArray[0]);
		}
		else {
		String []output =  FindPalindrome(stringArray);
		}
	}

}
