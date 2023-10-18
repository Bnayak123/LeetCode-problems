package leetcodeProblames.DSA50DaysChallenge;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class SorthCaractersByFrequency {
	public static String frequencySort(String s) {
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			if (map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
			} else {
				map.put(s.charAt(i), 1);
			}
		}

		Comparator<Character> cmp = (o1, o2) -> {return map.get(o2) - map.get(o1);};
		
		PriorityQueue<Character> pq = new PriorityQueue<>(cmp);
		pq.addAll(map.keySet());
		StringBuilder sb = new StringBuilder();
		while (!pq.isEmpty()) {
			char ch = pq.poll();
			for (int i = 0; i < map.get(ch); i++) {
				sb.append(ch);
			}
		}

		return sb.toString();
	}

	public static void main(String[] args) {
		String str = "tree";
		System.out.println(frequencySort(str));
	}
}