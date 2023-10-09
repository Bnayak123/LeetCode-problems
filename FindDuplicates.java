package leetcodeProblames;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicates {
	public List<Integer> findDuplicates(int[] nums) {
		int i = 0;
		List<Integer> ans = new ArrayList<>();
		while (i < nums.length) {
			int curent = nums[i] - 1;
			if (nums[i] != nums[curent]) {
				swap(nums, i, curent);
			} else {
				i++;
			}
		}
		for (int index = 0; index < nums.length; index++) {
			if (nums[index] != index + 1) {
				ans.add(nums[index]);
			}
		}

		return ans;

	}

	static void swap(int[] arr, int start, int end) {
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
	}
}