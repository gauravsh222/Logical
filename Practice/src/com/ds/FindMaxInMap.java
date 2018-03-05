package com.ds;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindMaxInMap {
	
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("Gulab Jamun", 3);
		map.put("Chhena", 3);
		map.put("Barfi", 2);
		map.put("Jalebi", 2);
		map.put("Laddu", 1);
		
		int max=Collections.max(map.values());
		List<String> l = new ArrayList<>(); 
		Set<Entry<String,Integer>> entrySet = map.entrySet();
		System.out.println(map);
		for(Entry<String, Integer> entry : entrySet) {
			if(entry.getValue().equals(max)) {
				l.add(entry.getKey());
			}
		}
		System.out.println("----------------------------------------------");
		System.out.println(l);
		Collections.sort(l);
		System.out.println(l);
		System.out.println(l.get(l.size()-1));
		
	}
}
