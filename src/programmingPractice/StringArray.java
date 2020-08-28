/**
 * 
 */
package programmingPractice;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.text.StyledEditorKit.BoldAction;


/**
 * @author KK030
 *
 */
public class StringArray {

	/**
	 * @param args
	 */
	public Boolean validateStringForSmall(String inputStr) {
			for (int i = 0; i <inputStr.length() ; i++) {
				int ascii= (int)inputStr.charAt(i);
				if (ascii >=65 && ascii <= 90) {
					return true;
				}
			}
		return false;
	}
	public Boolean validateStringForCapital(String inputStr) {

		for (int i = 0; i <inputStr.length() ; i++) {
			int ascii= (int)inputStr.charAt(i);
			if (ascii >=97 && ascii <= 122) {
				return true;
			}
		}
	return false;
		}
	public Boolean validateStringForDigit(String inputStr) {

		for (int i = 0; i <inputStr.length() ; i++) {
			int ascii= (int)inputStr.charAt(i);
			if (ascii >=48 && ascii <= 57) {
				return true;
			}
		}
	return false;
		}
	public Boolean validateStringForSymbol(String inputStr) {

		for (int i = 0; i <inputStr.length() ; i++) {
			int ascii= (int)inputStr.charAt(i);
			if (ascii >=33 && ascii <= 126 && !(ascii >=48 && ascii <= 57) && !(ascii >=65 && ascii <= 90) && !(ascii >=97 && ascii <= 122)) {
				return true;
			}
		}
	return false;
		}
	public Boolean validateStringForLength(String inputStr) {
		if (inputStr.length() >= 8) {
			return true;
		}
			return false;
		}
	
	public ArrayList<String> validateString (String inputStr[]) {
		
		ArrayList<String> output = new ArrayList<String>();
		//String[] output = new String[inputStr.length];
		int j=0;
		for (int i = 0; i < inputStr.length; i++) {
		
			if (validateStringForLength(inputStr[i]) &&
					validateStringForSmall(inputStr[i]) &&
						validateStringForCapital(inputStr[i]) &&
							validateStringForDigit(inputStr[i]) &&
								validateStringForSymbol(inputStr[i])) {
				
				output.add(inputStr[i]);	
				j++;
			}
		}
		
		
		return output;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the no of string to insert");
		
		Scanner scanner = new Scanner(System.in);
		int no = Integer.parseInt(scanner.nextLine());
		System.out.println("No >>"+no);
		String[] str = new String [no];
		System.out.println("Enter "+ no + " string ");		
		for (int i = 0; i < no; i++) {

			str[i] = scanner.nextLine();
		}
		
		System.out.println("Input strings are  >>>>>>>");
		for ( int i = 0; i < no; i++) {
		System.out.print(  str[i] + "   " );
		}
		System.out.println();
		StringArray stringArray = new StringArray();
		ArrayList<String> output = stringArray.validateString(str);
		System.out.println("output strings are  >>>>>>>");
		
		
		for ( int i = 0; i < output.size(); i++) {
		System.out.print(  output.get(i) + "  " );
	}
		
		}

}
