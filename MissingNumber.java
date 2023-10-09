package leetcodeProblames;

class MissingNumber {

	public static void main(String[] args) {
		int[] arr = {3,0,1};
		System.out.println("hhh");
		System.out.println(missingNumber(arr) );
	}

	public static int missingNumber(int[] nums) {
		int i = 0;
		while (i < nums.length) {
			int current = nums[i];
			if (nums[i] < nums.length && nums[i] != nums[nums[i]]) {
				swap(nums, i, current);
			} else {
				i++;
			}
		}
		for (int index = 0; index < nums.length; index++) {
			if (nums[index] != index) {
				return index;
			}
		}
		return nums.length;

	}

	public static void swap(int[] arr, int start, int end) {
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
	}
}