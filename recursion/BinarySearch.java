package recursion;

public class BinarySearch {

	public static int countEven(int[] nums) {
		
		int ans = 0;
		for (int num : nums) {
			int count = 0;
			while (num != 0) {
				count++;
				num = num / 10;

			}
			if (count % 2 == 0) {
				ans++;
			}
		}

		return ans;
	}
	
	public static void printNumber(int num) {
		
		if(num<1) {
			return;
		}
		
		printNumber(num-1);
		System.out.println(num);
	}

	public static int BinarySearchWithoutRecursion(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (target < arr[mid]) {
				end = mid - 1;
			} else if (target > arr[mid]) {
				start = mid + 1;
			} else {
				return mid;
			}

		}
		return -1;
	}

	public static int BinarySearchWithRecursion(int[] arr, int target, int start, int end) {
		if (start > end) {
			return -1;
		}
		int mid = start + (end - start) / 2;

		if (target == arr[mid]) {
			return mid;
		}
		if (target > arr[mid]) {
			return BinarySearchWithRecursion(arr, target, mid + 1, end);
		} else {
			return BinarySearchWithRecursion(arr, target, start, mid - 1);
		}

	}

	public static void main(String[] args) {
//		int[] arr = { 5, 6, 7, 8, 9, 10 };
//		System.out.println(BinarySearchWithoutRecursion(arr, 1));
//		System.out.println(BinarySearchWithRecursion(arr, 1, 0, arr.length - 1));

		//int[] arr = { 12,345,2,6,7896 };

	//	System.out.println(countEven(arr));
		printNumber(4);
		

	}

}
