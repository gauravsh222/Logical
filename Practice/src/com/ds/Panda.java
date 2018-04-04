package com.ds;

import java.util.HashMap;
import java.util.Map;

public class Panda {
	public static void main(String[] args) {
		String[] arr = new String[]{"bba", "abb", "abb", "bba"};
		Map<String, Integer> map = new HashMap<String, Integer>();
		StringBuffer sb = new StringBuffer();
		String key = "";
		int count = 0;
//		int n = Integer.parseInt(arr[1]);
		for (int i = 0; i < arr.length; i++) {
			key = sb.append(arr[i]).reverse().toString();
			System.out.println(key);
			if (map.containsKey(key)) {
				map.put(key, map.get(key) + 1);
				count++;
			} else {
				map.put(arr[i], 0);
			}
			sb = sb.delete(0, sb.length());
		}
		
		System.out.println(map);
	}
}
