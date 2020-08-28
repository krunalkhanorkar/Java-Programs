package leetCodingChallenge;

/**
 * @author Krunal Khanorkar
 *
 */
public class PowerOfFour {

	/*
	 * Given an integer (signed 32 bits), write a function to check whether it is a
	 * power of 4.
	 * 
	 * Example 1:
	 * 
	 * Input: 16 
	 * Output: true 
	 * 
	 * Example 2:
	 * 
	 * Input: 5
	 * Output: false
	 * 
	 */
	
	public static boolean isPowerOfFour(int num) {	
        if(num == 0) 
        return false; 
	        while(num != 1)
	        { 
	            if(num % 4 != 0) 
	            return false; 
	            num = num / 4;
	        }
        return true; 
    }
	
	public static void main(String[] args) {
		
		System.out.println(isPowerOfFour(32));
		
	}
}
