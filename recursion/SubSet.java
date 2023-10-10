package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSet {

	public static void main(String[] args) {

		// System.out.println(subSeq("", "abc"));
		// permutatios("","abc");
		// deailPad("","12");
		// System.out.println( diceFace("",4,6));
		// dice("",4);
//		System.out.println(count(3, 3));
//		printingPath("", 3, 3);
//		System.out.println(printingPathReturn("", 3, 3));
//		System.out.println(printingPathReturnWithDiagonal("", 3, 3));

		boolean[][] maze = { { true, true, true }, { true, true, true }, { true, true, true }

		};
		// pathWithRestiction("", 0, 0, maze);
		//pathWithRestictionWithUpAndDown("", 0, 0, maze);
		int[][] path= new int[maze.length][maze[0].length];
		printPath("", 0, 0, maze, path, 0);
//		int[] nums= {1,2,3};
//		List<List<Integer>> itretive = itretive(nums);
//		for(List<Integer> ans:itretive) {
//			System.out.println(ans);
//		}

	}

	public static void subset(String s, String str) {
		if (str.isEmpty()) {
			System.out.println(s);
			return;
		}
		char ch = str.charAt(0);
		if (ch == 'a') {
			subset(s, str.substring(1));
		} else {
			subset(s + ch, str.substring(1));
		}

	}

	public static String subset(String str) {
		if (str.isEmpty()) {
			return "";
		}
		char ch = str.charAt(0);
		if (ch == 'a') {
			return subset(str.substring(1));
		} else {
			return ch + subset(str.substring(1));
		}

	}

	public static ArrayList<String> subSeq(String s, String str) {
		if (str.isEmpty()) {
			ArrayList<String> list = new ArrayList<>();
			if (!s.isBlank())
				list.add(s);
			return list;
		}
		char ch = str.charAt(0);
		ArrayList<String> right = subSeq(s + ch, str.substring(1));
		ArrayList<String> left = subSeq(s, str.substring(1));

		right.addAll(left);
		return right;

	}

	public static List<List<Integer>> itretive(int[] nums) {
		List<List<Integer>> list = new ArrayList<>();
		list.add(new ArrayList<>());
		for (int num : nums) {
			int n = list.size();
			for (int i = 0; i < n; i++) {
				List<Integer> innerList = new ArrayList<>(list.get(i));
				innerList.add(num);
				list.add(innerList);
			}
		}
		return list;

	}

	public static void permutatios(String p, String str) {
		if (str.isEmpty()) {
			System.out.println(p);
			return;
		}
		char ch = str.charAt(0);
		for (int i = 0; i <= p.length(); i++) {
			String f = p.substring(0, i);
			String s = p.substring(i, p.length());
			permutatios(f + ch + s, str.substring(1));
		}

	}

	public static void deailPad(String s, String str) {
		if (str.isEmpty()) {
			System.out.println(s);
			return;

		}
		int digit = str.charAt(0) - '0';
		for (int i = (digit - 1) * 3; i < (digit) * 3; i++) {
			char ch = (char) ('a' + i);
			deailPad(s + ch, str.substring(1));

		}

	}

	public static ArrayList<String> diceFace(String str, int target, int face) {
		if (target == 0) {
			ArrayList<String> list = new ArrayList<>();
			list.add(str);
			return list;
		}
		ArrayList<String> list = new ArrayList<>();
		for (int i = 1; i <= face && i <= target; i++) {
			list.addAll(diceFace(str + i, target - i, face));
		}
		return list;
	}

	public static void dice(String str, int target) {
		if (target == 0) {
			System.out.println(str);
			return;
		}
		for (int i = 1; i <= 6 && i <= target; i++) {
			dice(str + i, target - i);
		}

	}

	public static int count(int r, int c) {
		if (r == 1 || c == 1) {
			return 1;
		}
		int left = count(r - 1, c);
		int right = count(r, c - 1);
		return left + right;
	}

	public static void printingPath(String s, int r, int c) {
		if (r == 1 && c == 1) {
			System.out.println(s);
			return;
		}
		if (r > 1)
			printingPath(s + "D", r - 1, c);
		if (c > 1)
			printingPath(s + "R", r, c - 1);

	}

	public static ArrayList<String> printingPathReturn(String s, int r, int c) {
		if (r == 1 && c == 1) {
			ArrayList<String> list = new ArrayList<>();
			list.add(s);
			return list;
		}
		ArrayList<String> list = new ArrayList<>();
		if (r > 1) {
			list.addAll(printingPathReturn(s + "D", r - 1, c));
		}
		if (c > 1) {
			list.addAll(printingPathReturn(s + "R", r, c - 1));
		}
		return list;
	}

	public static ArrayList<String> printingPathReturnWithDiagonal(String s, int r, int c) {
		if (r == 1 && c == 1) {
			ArrayList<String> list = new ArrayList<>();
			list.add(s);
			return list;
		}

		ArrayList<String> list = new ArrayList<>();

		if (r > 1 && c > 1) {
			list.addAll(printingPathReturnWithDiagonal(s + "D", r - 1, c - 1));
		}
		if (r > 1) {
			list.addAll(printingPathReturnWithDiagonal(s + "V", r - 1, c));
		}
		if (c > 1) {
			list.addAll(printingPathReturnWithDiagonal(s + "H", r, c - 1));
		}
		return list;
	}

	public static void pathWithRestiction(String s, int r, int c, boolean[][] maze) {
		if (r == maze.length - 1 && c == maze[r].length - 1) {
			System.out.println(s);
			return;
		}
		if (!maze[r][c]) {
			return;
		}
		if (r < maze.length - 1) {
			pathWithRestiction(s + 'D', r + 1, c, maze);
		}
		if (c < maze[r].length - 1) {
			pathWithRestiction(s + 'R', r, c + 1, maze);
		}
	}

	// backTracking
	public static void pathWithRestictionWithUpAndDown(String s, int r, int c, boolean[][] maze) {
		if (r == maze.length - 1 && c == maze[r].length - 1) {
			System.out.println(s);
			return;
		}
		if (!maze[r][c]) {
			return;
		}
		// i have made this change for once we visited the cell gain don't want to visit
		// if we visit again will get stack overflow due to same function call happened
		// again and again.
		maze[r][c] = false;
		if (r < maze.length - 1) {
			pathWithRestictionWithUpAndDown(s + 'D', r + 1, c, maze);
		}
		if (c < maze[r].length - 1) {
			pathWithRestictionWithUpAndDown(s + 'R', r, c + 1, maze);
		}

		if (r > 0) {
			pathWithRestictionWithUpAndDown(s + 'U', r - 1, c, maze);
		}
		if (c > 0) {
			pathWithRestictionWithUpAndDown(s + 'L', r, c - 1, maze);
		}

		// while return i will make changes which i made changes previously to same
		// state because if any new recursion call happened that will give wrong result
		maze[r][c] = true;

	}
	public static void printPath(String s, int r, int c, boolean[][] maze , int [][] steps, int step) {
		if (r == maze.length - 1 && c == maze[r].length - 1) {
			steps[r][c]=step;
			for(int[] are:steps) {
				System.out.println(Arrays.toString(are));
			}
			System.out.println(s);
			System.out.println();
			return;
		}
		if (!maze[r][c]) {
			return;
		}
		// i have made this change for once we visited the cell gain don't want to visit
		// if we visit again will get stack overflow due to same function call happened
		// again and again.
		maze[r][c] = false;
		steps[r][c]=step;
		if (r < maze.length - 1) {
			printPath(s + 'D', r + 1, c, maze ,steps, step+1);
		}
		if (c < maze[r].length - 1) {
			printPath(s + 'R', r, c + 1, maze,steps, step+1);
		}

		if (r > 0) {
			printPath(s + 'U', r - 1, c, maze,steps, step+1);
		}
		if (c > 0) {
			printPath(s + 'L', r, c - 1, maze,steps, step+1);
		}

		// while return i will make changes which i made changes previously to same
		// state because if any new recursion call happened that will give wrong result
		maze[r][c] = true;
		steps[r][c]=0;

	}

}
