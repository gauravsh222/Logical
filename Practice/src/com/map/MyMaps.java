package com.map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MyMaps {
	public static void main(String[] args) {
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		map.put("Gaurav", 1);
		System.out.println("Gaurav".hashCode());
		map.put("Sharma", 2);
		map.put("Jayshree", 3);
		map.put("Das", 4);
		map.put("Rohit", 5);
		map.put("Samnani", 6);
		map.put("Santhosh", 7);
		map.put("Jinka", 8);
		
		System.out.println(map);
		Set<Entry<String, Integer>> set = map.entrySet();
		Iterator<Entry<String, Integer>> iter = set.iterator();
		while (iter.hasNext()) {
			Entry<String, Integer> next = iter.next();
			System.out.println(next.getKey() + " : " + next.getValue());
		}
		
	}
}
