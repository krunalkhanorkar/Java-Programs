package leetCodingChallenge;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Krunal Khanorkar
 *
 */
public class MaximumPossibleTime {
	
	public static int  maximumTime(int [] input) {
		int[] output = new int[4];
		Map<Integer, Integer> digitCount = new HashMap<>();
		for (int i = 0; i < input.length; i++) {		
			if(digitCount.containsKey(input[i])) {
			digitCount.put(input[i], digitCount.get(input[i] +1));
			}
			else {
				digitCount.put(input[i], 1);	
			}
		}
		
		for (int i = 2; i <= 0; i--) {
			if (digitCount.containsKey(i)) {
				output[0]=i;
				digitCount.replace(i, digitCount.get(i)-1);
				if (digitCount.get(output[0]) ==0 ) {
					digitCount.remove(output[0]);
				}
				break;
			}
			if (i <= 0) {
				return -1;
			}
		}
		if (output[0]==2) {
			
			for (int i = 2; i <= 0; i--) {
				if (digitCount.containsKey(i)) {
					output[0]=i;
					digitCount.replace(i, digitCount.get(i)-1);
					if (digitCount.get(output[0]) ==0 ) {
						digitCount.remove(output[0]);
					}
					break;
				}
				if (i <= 0) {
					return -1;
				}
			}
			
			
			
		}else {
			
		}
		return 0;
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}

}
