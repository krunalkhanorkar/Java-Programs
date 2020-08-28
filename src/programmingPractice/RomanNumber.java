	/**
 * 
 */
package programmingPractice;

import java.util.Hashtable;
import java.util.Scanner;

/**
 * @author Krunal
 *
 */
public class RomanNumber {
	static String rom ="";
	/**
	 * @param args
	 */
	 Hashtable<Integer, String> SubRom = new Hashtable<Integer, String>();
	public RomanNumber() {	
		SubRom.put(1, "I");
		SubRom.put(4, "IV");
		SubRom.put(5, "V");
		SubRom.put(9, "IX");
		SubRom.put(10, "X");
		SubRom.put(40, "XL");
		SubRom.put(50, "L");
		SubRom.put(90, "XC");
		SubRom.put(100, "C");
		SubRom.put(400, "CD");
		SubRom.put(500, "D");
		SubRom.put(900, "CM");
		SubRom.put(1000, "M");
	}
	
	
	
	public  void Roman(int num) {
		System.out.println("Number >>"+ num);

		while (num!=0) {
			int key=0;
			if ( num >= 1000) {
				key = 1000;
				num =num -1000;
				rom = rom + SubRom.get(key);
				continue;
			}
			else if (num >= 900) {
				key = 900;
				num =num -900;
				rom = rom + SubRom.get(key);
				continue;
			}else if (num >= 500) {
				key = 500;
				num =num -500;
				rom = rom + SubRom.get(key);
				continue;
			}
			else if (num >= 400) {
				key = 400;
				num =num -400;
				rom = rom + SubRom.get(key);
				continue;
			}else if (num >= 100) {
				key = 100;
				num =num -100;
				rom = rom + SubRom.get(key);
				continue;
			}
			else if (num >= 90) {
				key = 90;
				num =num -90;
				rom = rom + SubRom.get(key);
				continue;
			}else if (num >= 50) {
				key = 50;
				num =num-50;
				rom = rom + SubRom.get(key);
				continue;
			}
			else if (num >= 40) {
				key = 40;
				num =num-40;
				rom = rom + SubRom.get(key);
				continue;
			}else if (num >= 10) {
				key = 10;
				num =num -10;
				rom = rom + SubRom.get(key);
				continue;
			}else if (num >= 9) {
				key = 9;
				num =num -9;
				rom = rom + SubRom.get(key);
				continue;
			}else if (num >= 5) {
				key = 5;
				num =num -5;
				rom = rom + SubRom.get(key);
				continue;
			}else if (num >= 4) {
				key = 4;
				num =num -4;
				rom = rom + SubRom.get(key);
				continue;
			}else {
				key = 1;
				num =num -1;
				rom = rom + SubRom.get(key);
				continue;}
		}
		System.out.println("Roman Numerals >>"+ rom);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the number to be converted to Roman");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		RomanNumber roman = new RomanNumber();
		roman.Roman(num);
		
	}

}
