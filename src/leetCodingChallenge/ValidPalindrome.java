package leetCodingChallenge;


/**
 * @author Krunal Khanorkar
 *
 */
public class ValidPalindrome {

	/*
	 * Given a string, determine if it is a palindrome, considering only
	 * alphanumeric characters and ignoring cases.
	 * 
	 * Note: For the purpose of this problem, we define empty string as valid
	 * palindrome.
	 * 
	 * Example 1:
	 * 
	 * Input: "A man, a plan, a canal: Panama"
	 *  Output: true Example 2:
	 * 
	 * Input: "race a car" 
	 * Output: false
	 * 
	 */
	
	
	
	
	
	
public static boolean isPalindrome(String s) {
	if (s.length() <= 1) {
		return true;
	}
	StringBuffer temp = new StringBuffer();
	for (int i = 0; i < s.length(); i++) {
		Character ch = s.charAt(i);
		if ( ch.isLetter(ch) || ch.isDigit(ch)) {
			temp.append(ch.toUpperCase(ch));
		}
	}
	int lastIndex = temp.length()-1;	
	for (int i = 0; i < temp.length()/2; i++, lastIndex--) {
		if (temp.charAt(i) == temp.charAt(lastIndex)) {
			continue;
		}
		else
			return false;
	}
	return true ;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome("race a car"));
	}

}
