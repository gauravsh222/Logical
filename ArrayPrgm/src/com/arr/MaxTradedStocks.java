package com.arr;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class MaxTradedStocks {
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("C:/Users/gaurav.sharma/Desktop/New folder/stocks.txt");
		List<String> readAllLines = Files.readAllLines(path);
		Iterator<String> iter = readAllLines.iterator();
		while (iter.hasNext()) {
			addIntoMap(iter.next());
		}
	}

	private static void addIntoMap(String line) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		
	}
}
