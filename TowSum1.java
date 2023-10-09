package leetcodeProblames;

import java.util.HashMap;
import java.util.Map;

public class TowSum1 {
//	Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//
//			You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
//			You can return the answer in any order.

//	Input: nums = [2,7,11,15], target = 9
//			Output: [0,1]
//			Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

//	Input: nums = [3,2,4], target = 6
//			Output: [1,2]

//	Input: nums = [3,3], target = 6
//			Output: [0,1]

	public int[] twoSum(int[] nums, int target) {

		Map<Integer, Integer> map = new HashMap<>();
		int[] ans = new int[2];
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(target - nums[i])) {
				ans[0] = map.get(target - nums[i]);
				ans[1] = i;
				return ans;
			} else {
				map.put(nums[i], i);
			}
		}

		return ans;
	}

	public static void main(String[] args) {
		TowSum1 sum1 = new TowSum1();
		int []nums = new int[] {3,2,4};
		int[] twoSum = sum1.twoSum(nums, 6);
		for (int i : twoSum) {
			System.out.println(i);
			
		}
	}
}
