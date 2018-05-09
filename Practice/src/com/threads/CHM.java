package com.threads;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

class CHMRead implements Runnable {

	 Map<String, Integer> map;

	public CHMRead(Map<String, Integer> map) {
		this.map = map;
	}

	@Override
	public void run() {
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Entry<String, Integer>> it = entrySet.iterator();
		
		try {
			System.out.println("Read Sleeping");
			Thread.sleep(5000); 
		} catch (InterruptedException e) { 
			e.printStackTrace(); 
		}
		
		System.out.println("read Wokeup");
		boolean b;
		while (b=it.hasNext()) {
			System.out.println(b);
			Entry<String, Integer> next = it.next();
			System.out.println("Read : " + next.getKey() + " : " + next.getValue());
		}
		
		/*for(Entry<String, Integer> entry : entrySet) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}*/
	}
}

class CHMWrite implements Runnable {
	 Map<String, Integer> map;
	public CHMWrite(Map<String, Integer> map) {
		this.map = map;
	}
	@Override
	public void run() {
		try {
			System.out.println("Write Sleeping");
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Write Wokeup");
		map.put("ABC", 2);
		map.put("XYZ", 2);
		System.out.println("Write A : " + map.get("XYZ"));
		System.out.println("Write B : " + map.get("ABC"));
		map.remove("ABC");
		map.remove("XYZ");
		System.out.println("Write A : " + map.get("XYZ"));
		System.out.println("Write B : " + map.get("ABC"));
		map.put("ABC", 5);
		map.put("XYZ", 5);
		System.out.println("Write A : " + map.get("XYZ"));
		System.out.println("Write B : " + map.get("ABC"));
	}
}

public class CHM {
	Map<String, Integer> map ;
	public static void main(String[] args) {
		CHM c = new CHM();
		c.map = new ConcurrentHashMap<String, Integer>();
		c.map.put("ABC", 1);
		c.map.put("XYZ", 1);
		Thread t1 = new Thread(new CHMRead(c.map), "Read");
		Thread t2 = new Thread(new CHMWrite(c.map), "Write");
		t1.start();
		t2.start();
	}
}
