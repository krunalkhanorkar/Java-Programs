package leetCodingChallenge;

/**
 * @author Krunal Khanorkar
 *
 */
public class DetectCapital {

	/*
	 * Given a word, you need to judge whether the usage of capitals in it is right
	 * or not.
	 * 
	 * We define the usage of capitals in a word to be right when one of the
	 * following cases holds:
	 * 
	 * All letters in this word are capitals, like "USA".
	 * 
	 *  All letters in this word are not capitals, like "leetcode". 
	 * 
	 *  Only the first letter in this word is capital, like "Google". 
	 *  
	 *  Otherwise, we define that this word doesn't use capitals in a right way.
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: "USA" Output: True
	 * 
	 * Example 2:
	 * 
	 * Input: "FlaG" Output: False
	 * 
	 */		
	
public static boolean detectCapitalUse(String word) {
	
	if (word.length() <=1) {
		return true;
	}
	
	Character FirstChar = word.charAt(0);
	Character SecondChar = word.charAt(1);
	
	if (FirstChar - 'a' >= 0 && FirstChar - 'a' <= 25 ) {
		for (int i = 1; i < word.length(); i++) {
			if (word.charAt(i) - 'a' >= 0 && word.charAt(i) - 'a' <= 25 ) {
				continue;
			}else {
				return false;
			}
		}
		return true;
	}
	else if(FirstChar - 'A' >= 0 && FirstChar - 'A' <= 25) {
		
		if (SecondChar - 'A' >= 0 && SecondChar - 'A' <= 25) {
			
			for (int i = 2; i < word.length(); i++) {
				if (word.charAt(i) - 'A' >= 0 && word.charAt(i) - 'A' <= 25 ) {
					continue;
				}else {
					return false;
				}
			}
			return true;
			
		} else if(SecondChar - 'a' >= 0 && SecondChar - 'a' <= 25) {
			for (int i = 2; i < word.length(); i++) {
				if (word.charAt(i) - 'a' >= 0 && word.charAt(i) - 'a' <= 25 ) {
					continue;
				}else {
					return false;
				}
			}
			return true;
		}
		else
			return false;
	}
	else
	return false;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(detectCapitalUse("ACa"));

	}

}
