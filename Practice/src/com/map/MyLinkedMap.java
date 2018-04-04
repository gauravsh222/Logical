package com.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MyLinkedMap {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("ABC", 1);
		map.put("ABCD", 4);
		map.put("ABCDE", 3);
		map.put("ABCDEF", 2);
		map.put("ABCDEG", 2);
		map.put("ABCDEFG", 2);
		map.put("ABCDEFGFF", 2);
		map.put("DDABCDEFG", 2);
		
		System.out.println(map);
		Set<Entry<String, Integer>> set = map.entrySet();
		Iterator<Entry<String, Integer>> iter = set.iterator();
		while (iter.hasNext()) {
			Entry<String, Integer> next = iter.next();
			System.out.println(next.getKey() + " : " + next.getValue());
		}
		
	}
}
