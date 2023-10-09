package leetcodeProblames;

public class FindDuplicate {
	public static void main(String[] args) {
		int[] arr = { 1, 3, 4, 2, 2 };
		System.out.println(findDuplicate(arr));
	}

	public static int findDuplicate(int[] nums) {
		int i = 0;
		while (i < nums.length) {
			if (nums[i] != i + 1) {
				int current = nums[i] - 1;
				if (nums[i] != nums[current]) {
					swap(nums, i, current);
				} else {
					return nums[i];
				}
			} else {
				i++;
			}

		}
		return -1;

	}

	static void swap(int[] arr, int first, int secound) {
		int temp = arr[first];
		arr[first] = arr[secound];
		arr[secound] = temp;
	}
}