package com.test;

import java.util.HashMap;
import java.util.Map;

public class MyMap {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		System.out.println(map.get("Hello"));
		map.put("Hello", 1);
		System.out.println(map.get("Hello"));
	}
}
