/**
 * 
 */
package programmingPractice;

import java.util.Scanner;


/**
 * @author Krunal
 *
 */
public class WordGenerator {

	/**
	 * @param args
	 */
	
	/**
	 * @param word
	 * @return
	 */
	private static String wordgenerator(String word) {
		// TODO Auto-generated method stub
		String output = "";
		for (int i = 0; i <word.length() ; i++) {
			
			int ascii= word.charAt(i);
			
			if (ascii <=65 && ascii >= 90  ) {
				ascii= ascii+3;
				if(ascii> 90 )
				{
					int n = ascii-90;
					ascii = 65 + n-1;
				}				
			}
			else  {
				ascii= ascii+3;
			if(ascii> 122 )
			{
				int n = ascii-122;
				ascii = 97 + n-1;
			}
			}
	char c = (char) ascii;
	output = output+c;
		
		}

		return output;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a String");
	Scanner scanner = new Scanner(System.in);
	String word = scanner.nextLine();
	scanner.close();
	String output = wordgenerator(word);
	System.out.println("output >> " +output);

	}
}