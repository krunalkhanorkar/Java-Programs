package leetCodingChallenge;

import java.util.HashMap;

/**
 * @author Krunal Khanorkar
 *
 */
public class SumOfTwoNumbers {
	/*
	Given an array of integers, return indices of the two numbers such that they add up to a specific target.

			You may assume that each input would have exactly one solution, and you may not use the same element twice.

			Example:

			Given nums = [2, 7, 11, 15], target = 9,

			Because nums[0] + nums[1] = 2 + 7 = 9,
			return [0, 1].
			
	*/
	
	public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap <>();
        
        for(int i=0; i <nums.length; i++){
            map.put(nums[i], i);
        }
        for(int i=0; i<nums.length; i++){
            int diff = target- nums[i];
            if(map.containsKey(diff) &&  map.get(diff) != i){
            	System.out.println(i  + "    "+ map.get(diff));
                return new int [] {i, map.get(diff)};
            }     
        }
        throw new IllegalArgumentException("No two sum solution");
    }
					
					
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int []nums = {11,1, 7, 10, 8};
		 int target = 9;
		 int[] output = twoSum(nums, target);
		System.out.println(output[0] + "   " + output[1]);

	}

}
