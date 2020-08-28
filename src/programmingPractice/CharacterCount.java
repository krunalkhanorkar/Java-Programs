/**
 * 
 */
package programmingPractice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Krunal Khanorkar
 *
 */
public class CharacterCount {


	public static HashMap<Character, Integer> CharacterHashmap(String string) {
	
		int len = string.length();
		HashMap<Character, Integer> charMap = new HashMap<Character, Integer>();
		
		int i = 0;
		charMap.put(string.charAt(i), 0);
		do {
		for (Map.Entry entry : charMap.entrySet()) {
			char c = (Character)entry.getKey();
			if (c== string.charAt(i)) {
				entry.setValue((Integer)entry.getValue()+1);
				break;
			}
			charMap.put(string.charAt(i), 1);
		}
			
			i++;
		} while (i < len);
		
		return charMap;
	}
	public static int [] count (HashMap<Character, Integer> charMap) {
		int i=0;
		int arr []= new int [charMap.size()]; 			
		for ( Map.Entry hm : charMap.entrySet()) {
			arr[i] = (int) hm.getValue();
			i++;
		}
		return arr;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Please enter a string ");
		Scanner scan = new Scanner(System.in);
		String string = scan.nextLine();
		HashMap<Character, Integer> charMap = CharacterCount.CharacterHashmap(string);
	}

}
