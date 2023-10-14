package leetcodeProblames.DSA50DaysChallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//https://leetcode.com/problems/4sum/description/

//Example 1:
//
//Input: nums = [1,0,-1,0,-2,2], target = 0
//Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
//Example 2:
//
//Input: nums = [2,2,2,2,2], target = 8
//Output: [[2,2,2,2]]
public class FourSum {
	public static List<List<Integer>> fourSum(int[] nums, int target) {
		Arrays.sort(nums);
		Set<List<Integer>> s = new HashSet<>();
		List<List<Integer>> ans = new ArrayList<>();

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				int k = j + 1;
				int l = nums.length - 1;
				while (k < l) {
					long sum = nums[i];
					sum += nums[j];
					sum += nums[k];
					sum += nums[l];
					if (sum == target) {
						List<Integer> list = new ArrayList<>();
						list.add(nums[i]);
						list.add(nums[j]);
						list.add(nums[k]);
						list.add(nums[l]);
						s.add(list);
						k++;
						l--;
					} else if (sum > target) {
						l--;
					} else {
						k++;
					}
				}
			}
		}
		ans.addAll(s);
		return ans;

	}

	public static void main(String[] args) {
		int[] nums = { 1000000000,1000000000,1000000000,1000000000};

		List<List<Integer>> fourSum = fourSum(nums, -294967296);
		for (List<Integer> list : fourSum) {
			System.out.println(list);
		}
	}

}
