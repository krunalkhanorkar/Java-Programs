/**
 * 
 */
package programmingPractice;

import java.util.Scanner;

/**
 * @author KK030
 *
 */
public class StringRemove {

	private static String stringRemove(String str1, String str2) {
		String [] s2 = str2.split("");
		for (int i = 0; i < s2.length; i++) {
			System.out.println("replace >>>" + s2[i] );
			str1 = str1.replaceAll(s2[i] , "");
				}
		return str1;
	}
	/**
	 * @param input
	 * @return
	 */
	private static String removesubstring(String input) {
		int start, end = 0;
		String output = input;
		for (int i = 0; i < input.length(); i++) {
			input =output;
			if (input.charAt(i)== '{') {
				start =i;
				for (int j = i+1; j < input.length(); j++) {
					if (input.charAt(j)== '}') {
						end = j;
						break;
					}
				}
				if (end!=0) {
					String subsgtr = input.substring(start, end+1);
					System.out.println(subsgtr);
					input = input.replaceAll(subsgtr.toString(), "");
				}
			}
		}
		
		return input;
	}
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/*
		 * System.out.println("Enter 2 string"); 
		 * 
		 * String s1 = scan.nextLine(); String s2 = scan.nextLine();
		 * 
		 * String output = stringRemove(s1, s2);
		 * System.out.println("String output >>>>>" + output );
		 */
		
		System.out.println("Enter input string");
		String input = scan.nextLine();
		String output = removesubstring(input);
		System.out.println("String output >>>>>" + output );
	}

	

}
