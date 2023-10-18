package leetcodeProblames.DSA50DaysChallenge;

import java.util.HashSet;
import java.util.Stack;

//Example 1:
//
//Input: s = "lee(t(c)o)de)"
//Output: "lee(t(c)o)de"
//Explanation: "lee(t(co)de)" , "lee(t(c)ode)" would also be accepted.
//Example 2:
//
//Input: s = "a)b(c)d"
//Output: "ab(c)d"
//Example 3:
//
//Input: s = "))(("
//Output: ""
//Explanation: An empty string is also valid.
//https://leetcode.com/problems/minimum-remove-to-make-valid-parentheses/

public class MinimumRemoveToMakeValidParentheses {

	public static String minRemoveToMakeValid(String s) {
		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (Character.isAlphabetic(c)) {
				continue;
			}
			if (c == '(')
				stack.push(i);
			else {
				if (!stack.isEmpty() && s.charAt(stack.peek()) == '(') {
					stack.pop();
				} else {
					stack.push(i);
				}
			}
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			if (!stack.contains(i)) {
				sb.append(s.charAt(i));
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		String s= "lee(t(c)o)de)";
    System.out.println(minRemoveToMakeValid(s));
	}
}
