package com.ds;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedMaps {
	public static void main(String[] args) {
		LinkedHashMap<String, String> map = new LinkedHashMap<>();
		map.removeEldestEntry(null);
	}
}
