package leetcodeProblames.DSA50DaysChallenge;

import java.util.Arrays;

//https://leetcode.com/problems/sort-colors/description/

//Example 1:
//Input: nums = [2,0,2,1,1,0]
//Output: [0,0,1,1,2,2]
//Example 2:
//
//Input: nums = [2,0,1]
//Output: [0,1,2]
public class SortColors {
	public static void sortColors(int[] nums) {

	        int low = 0, mid = 0;

	        int high = nums.length - 1;

	        while(mid <= high){

	            if(nums[mid]==0){

	             int temp = nums[mid];

	             nums[mid] = nums[low];

	             nums[low] = temp;

	             low++;  mid++;

	         }

	         else if(nums[mid]==1){

	             mid++;

	         }else{

	             int temp =nums[mid];

	             nums[mid] = nums[high];

	             nums[high] = temp;

	             high--;

	         }

	        }
	}
	public static void main(String[] args) {
		int[] nums= {2,0,2,1,1,0};
		System.out.println(Arrays.toString(nums));
		sortColors(nums);
		System.out.println("===========After Sorting=============");
		System.out.println(Arrays.toString(nums));
	}
	
}
