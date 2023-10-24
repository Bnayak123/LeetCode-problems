package leetcodeProblames.ArraysProblems;

import java.util.Arrays;

//https://leetcode.com/problems/build-array-from-permutation/description/ (leetcode No:- 190)

//Example 1:
//
//Input: nums = [0,2,1,5,3,4]
//Output: [0,1,2,4,5,3]
//Explanation: The array ans is built as follows: 
//ans = [nums[nums[0]], nums[nums[1]], nums[nums[2]], nums[nums[3]], nums[nums[4]], nums[nums[5]]]
//    = [nums[0], nums[2], nums[1], nums[5], nums[3], nums[4]]
//    = [0,1,2,4,5,3]
//Example 2:
//
//Input: nums = [5,0,1,2,3,4]
//Output: [4,5,0,1,2,3]
//Explanation: The array ans is built as follows:
//ans = [nums[nums[0]], nums[nums[1]], nums[nums[2]], nums[nums[3]], nums[nums[4]], nums[nums[5]]]
//    = [nums[5], nums[0], nums[1], nums[2], nums[3], nums[4]]
//    = [4,5,0,1,2,3]

// step 1 iterate over the Array 
// step 2 place the element position based on the element value 

public class Build_Array_From_Permutation {
	 public static int[] buildArray(int[] nums) {
	        int[] ans= new int[nums.length];
	        // Iterating all the  Elements in the Array
	        for(int i=0;i<nums.length;i++){
	        //take the index value and please the element to the value
	          ans[i] = nums[nums[i]];
	        }
	        return ans;
	    }
	 public static void main(String[] args) {
		int [] nums={0,2,1,5,3,4};
		System.out.println(Arrays.toString(buildArray(nums)));
		
	}

}
