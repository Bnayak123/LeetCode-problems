package leetcodeProblames;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountItemMatch {

	public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
		int ans = 0;
		for (List<String> s : items) {
			if (ruleKey.equals("color")) {
				System.out.println(s.get(0));
				if (s.get(1).equals(ruleValue))
					ans++;

			} else if (ruleKey.equals("type")) {
				if (s.get(0).equals(ruleValue))
					ans++;
			} else if (ruleKey.equals("name")) {
				if (s.get(2).equals(ruleValue))
					ans++;
			}

		}
		return ans;
	}

	public static void test(String s1, String s2) {
		if (s1 == s2) {
			System.out.println("s1 equals to s2");
		} else {
			System.out.println("s1 not equals to s2");
		}
	}

	public static void main(String[] args) {
	
		
	final	Integer i= new Integer(9);
	
		
		
		
		
		

		
		String s1 = "hello";
		String s2 = "hello";

		test(s1, s2);

		s2 = "hello cat";

		test(s1, s2);

		Integer i1 = 234;
		Integer i2 = 456;

		test1(i1, i2);

		i2 = 980;
		test1(i1, i2);

		List<List<String>> list = new ArrayList<>();
		List<String> asList1 = Arrays.asList("phone", "silver", "computer");
		List<String> asList2 = Arrays.asList("phone", "red", "color");
		list.add(asList1);
		list.add(asList2);

		int countMatches = countMatches(list, "color", "silver");
		System.out.println(countMatches);

	}

	private static void test1(Integer i1, Integer i2) {
		if (i1 == i2) {
			System.out.println("equal");
		} else {
			System.out.println("not equal");
		}

	}

}
