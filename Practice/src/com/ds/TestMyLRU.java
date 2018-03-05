package com.ds;

import java.util.Map;

public class TestMyLRU {
	public static void main(String[] args) {
		Map<String, Employee> map = new LinkedHashMap(3);
		map.put("One", new Employee(10, "Gaurav", 1000.0));
		System.out.println(map);
		map.put("Two", new Employee(200, "ABC", 2000.0));
		System.out.println(map);
		map.put("Three", new Employee(300, "XYZ", 3000.0));
		System.out.println(map);
		map.put("Four", new Employee(400, "Hello", 4000.0));
		System.out.println(map);
		System.out.println(map.size());
	}
}
