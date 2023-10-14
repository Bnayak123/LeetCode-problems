package leetcodeProblames.DSA50DaysChallenge;

import java.util.Arrays;
import java.util.LinkedList;

//Example 1:
//
//Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
//Output: [[1,6],[8,10],[15,18]]
//Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].
//Example 2:
//
//Input: intervals = [[1,4],[4,5]]
//Output: [[1,5]]
//Explanation: Intervals [1,4] and [4,5] are considered overlapping.

//https://leetcode.com/problems/merge-intervals/description/
public class MergeIntervals {

	public static int[][] merge(int[][] intervals) {
		Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
		LinkedList<int[]> margeList = new LinkedList<>();
		for (int[] interval : intervals) {
			if (margeList.isEmpty() || margeList.getLast()[1] < interval[0]) {
				margeList.add(interval);

			} else {
				margeList.getLast()[1] = Math.max(interval[1], margeList.getLast()[1]);

			}
		}
		return margeList.toArray(new int[margeList.size()][]);
	}

	public static void main(String[] args) {
		int[][] intervals = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };
		int[][] merge = merge(intervals);

		for (int[] ans : merge) {
			System.out.println(Arrays.toString(ans));
		}
	}

}
