package com.arr;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class KPMG {
	public static void main(String[] args) {
		Map<String, List<Integer>> sumMap = new HashMap<>();
		Map<String, List<Integer>> countMap = new HashMap<>();

		Object[][] testData = new Object[][] { { "Vishal", 33 }, { "Anish", 44 }, { "Kumar", 34 }, { "Rifa", 35 },
				{ "Riya", 46 }, { "Riya", 36 }, { "Rifa", 65 }, { "Riya", 49 }, { "Anish", 54 } };

		for (int i = 0; i < testData.length; i++) {
			String key = (String) testData[i][0];
			Integer val = (Integer) testData[i][1];
			if (sumMap.containsKey(key)) {
				sumMap.get(key).add(val);
			} else {
				List<Integer> list = new ArrayList<>();
				list.add(val);
				sumMap.put(key, list);
			}
		}
		Object[][] result = new Object[sumMap.size()][2];
		Set<Entry<String, List<Integer>>> entrySet = sumMap.entrySet();
		Iterator<Entry<String, List<Integer>>> iter = entrySet.iterator();
		while (iter.hasNext()) {
			Entry<String, List<Integer>> next = iter.next();
			String key = next.getKey();
			List<Integer> val = next.getValue();
			int sum = 0;
			int row = 0;
			Iterator<Integer> iterator = val.iterator();
			while (iterator.hasNext()) {
				Integer next2 = iterator.next();
				sum += next2;
			}
			int avg = sum / val.size();
			result[row][0] = key;
			result[row][1] = avg;
			System.out.println(result[row][0] + " : " + result[row][1]);
			row++;
		}

		for (int r = 0; r < result.length; r++) {
			for (int c = 0; c < 2; c++) {
				System.out.println(result[r][c] + " : " + result[r][c]);
			}
		}
	}

	private void avg () {
		Map<String, List<Integer>> sumMap = new HashMap<>();
		Map<String, List<Integer>> countMap = new HashMap<>();
		
		Object[][] testData = new Object[][] { { "Vishal", 33 }, { "Anish", 44 }, { "Kumar", 34 }, { "Rifa", 35 },
				{ "Riya", 46 }, { "Riya", 36 }, { "Rifa", 65 }, { "Riya", 49 }, { "Anish", 54 } };
				
		for (int i = 0; i < testData.length; i++) {
			String key = (String) testData[i][0];
			Integer val = (Integer) testData[i][1];
			if (sumMap.containsKey(key)) {
				sumMap.get(key).add(val);
			} else {
				List<Integer> list = new ArrayList<>();
				list.add(val);
				sumMap.put(key, list);
			}
		}
		Object[][] result = new Object[sumMap.size()][2];
		Set<Entry<String,List<Integer>>> entrySet = sumMap.entrySet();
		Iterator<Entry<String, List<Integer>>> iter = entrySet.iterator();
		while (iter.hasNext()) {
			Entry<String, List<Integer>> next = iter.next();
			String key = next.getKey();
			List<Integer> val = next.getValue();
			int sum=0;
			int row=0;
			Iterator<Integer> iterator = val.iterator();
			while (iterator.hasNext()) {
				Integer next2 = iterator.next();
				sum += next2;
			}
			int avg = sum/val.size();
			result[row][0] = key;
			result[row][1] = avg;
			System.out.println(result[row][0] + " : " + result[row][1]);
			row++;
		}
		
		for(int r=0; r<result.length;r++) {
			for(int c=0; c<2;c++) {
			System.out.println(result[r][c] + " : " + result[r][c]);
		}
		}
	}
}
