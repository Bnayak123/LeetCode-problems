package leetcodeProblames;

import java.util.ArrayList;
import java.util.List;

public class FindDisappearedNumbers {

	public static void main(String[] args) {
		int[] arr = { 4, 3, 2, 7, 8, 2, 3, 1 };
		System.out.println(findDisappearedNumbers(arr));

	}

	public static List<Integer> findDisappearedNumbers(int[] nums) {
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
				ans.add(index + 1);
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