package leetCodingChallenge;

import java.util.LinkedList;
import java.util.List;

public class FindDuplicatesInArray {

	/*
	 * 
	 * Given an array of integers, 1 ≤ a[i] ≤ n (n = size of array), some elements
	 * appear twice and others appear once.
	 * 
	 * Find all the elements that appear twice in this array.
	 * 
	 * Could you do it without extra space and in O(n) runtime?
	 
 	   Input:
		[4,3,2,7,8,2,3,1]

	   Output:
		[2,3]
	 * 
	 * 
	 * 
	 */
	public static List<Integer> findDuplicates(int[] nums) {
        List <Integer> output = new LinkedList<>();
        
        for(int i =0; i < nums.length; i++){
        		int index = Math.abs(nums[i])-1 ;
        	nums[index] = -1 * nums[index];
        		if(nums[index] > 0){
        			output.add(Math.abs(nums[i]));
        		}
        }
        return output;
    }
	
	
	public static void main(String[] args) {
		int [] input = {4,3,2,7,8,2,3,1};
		System.out.println(findDuplicates(input));
	}

}
