package leetcodeProblames;

import java.util.ArrayList;
import java.util.List;

class Solution {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
//		list.add(3);
//		list.add(4);
//		list.add(5);
//		list.add(1);
//		list.add(2);

//		list.add(4);
//		list.add(5);
//		list.add(1);
//		list.add(2);
//		list.add(3);
		
//		list.add(1);
//		list.add(3);
//		list.add(5);

		list.add(2);
		list.add(1);
		list.add(4);

		System.out.println(minimumRightShifts(list));
	}

	public static int minimumRightShifts(List<Integer> nums) {
		if (!isSort(nums)) {
			return 0;
		}
		int count = 0;

		while (isSort(nums)) {
			if (count == nums.size()) {
				return -1;
			}

			List<Integer> list = new ArrayList<>();
			list.add(nums.get(nums.size() - 1));
			for (int i = 0; i < nums.size() - 1; i++) {
				list.add(nums.get(i));
			}
			nums = list;
			count++;

		}
		;

		return count;

	}

	static boolean isSort(List<Integer> nums) {
		for (int i = 0; i < nums.size() - 1; i++) {
			for (int j = i + 1; j < nums.size(); j++) {
				if (nums.get(i) > nums.get(j)) {
					return true;
				}
			}
		}
		return false;
	}
}


  
  