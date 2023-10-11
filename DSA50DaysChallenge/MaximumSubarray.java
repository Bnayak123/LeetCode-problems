package leetcodeProblames.DSA50DaysChallenge;

//https://leetcode.com/problems/maximum-subarray/

/*Approach:
1.We start by initializing two variables: maxSum and currentSum.
	maxSum represents the maximum sum encountered so far and is initially set to the minimum possible integer value to ensure that any valid subarray sum will be greater than it.
	currentSum represents the current sum of the subarray being considered and is initially set to 0.
2.We iterate through the nums array using a forEach loop, starting from the first element and going up to the last element.
3.For each element in the array, we add it to the current sum currentSum. This calculates the sum of the subarray ending at the current element.
4.Next, we check if the current sum currentSum is greater than the current maximum sum maxSum.
5.If it is, we update maxSum with the new value of currentSum. This means we have found a new maximum subarray sum.
6.If the current sum currentSum becomes negative, it indicates that including the current element in the subarray would reduce the overall sum. In such cases, we reset currentSum to 0. This effectively discards the current subarray and allows us to start a fresh subarray from the next element.
7.We repeat steps 3 to 5 for each element in the array.
8.After iterating through the entire array, the variable maxSum will contain the maximum subarray sum encountered.
9.Finally, we return the value of maxSum as the result, representing the maximum sum of a contiguous subarray within the given array nums.*/

//Example 1:
//
//Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
//Output: 6
//Explanation: The subarray [4,-1,2,1] has the largest sum 6.
//Example 2:
//
//Input: nums = [1]
//Output: 1
//Explanation: The subarray [1] has the largest sum 1.
//Example 3:
//
//Input: nums = [5,4,-1,7,8]
//Output: 23
//Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.
public class MaximumSubarray {

	public static int maxSubArray(int[] nums) {
		int maxSum = Integer.MIN_VALUE;
		int currentSum = 0;
		for (int i : nums) {
			currentSum += i;
			if (currentSum > maxSum) {
				maxSum = currentSum;
			}
			if (currentSum < 0) {
				currentSum = 0;
			}
		}
		return maxSum;

	}

	public static void main(String[] args) {
		int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		System.out.println(maxSubArray(nums));

	}
}
