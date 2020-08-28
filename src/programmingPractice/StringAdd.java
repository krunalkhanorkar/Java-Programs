/**
 * 
 */
package programmingPractice;

import java.util.Scanner;

/**
 * @author Krunal
 *
 */


public class StringAdd {

	public static String addString(String s1, String s2) {
		String str = "";
		char []S1Arr = s1.toCharArray(); 
		char []S2Arr = s2.toCharArray();
	for (int i = 0; i < S1Arr.length; i++) {

		
	str = str + S1Arr[i] + S2Arr[i];
		
	}	
		return str;
	}
	public static String add2String(String s1, String s2) {
		String str = "";
 
		char []S1Arr = s1.toCharArray(); 
		char []S2Arr = s2.toCharArray();
		int length = 0 ;
		String longString = null;
		
		if(S1Arr.length >S2Arr.length) {
			length = S2Arr.length;
			longString = s1;
		}else {
			length=	S1Arr.length;
			longString = s2;
		}
				
	for (int i = 0; i <length; i++) {

		
	str = str + S1Arr[i] + S2Arr[i];
		
	}	
		return str+ longString.substring(length);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter two strings of equal lengths");
		
		Scanner scanner = new Scanner(System.in);
		String s1 = scanner.nextLine();
		String s2 = scanner.nextLine();
		scanner.close();
		if (s1.length()==s2.length()) {
			String str =addString(s1, s2);
			System.out.println("Modified String is  : " + str);
		}else {
			String str =add2String(s1, s2);
			System.out.println("Modified String is  : " + str);
		}		
	}
}