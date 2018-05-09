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
		while (it.hasNext()) {
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
		map.put("z", 2);
		map.put("T", 2);
		map.put("c", 2);
		map.put("d", 2);
		System.out.println("Write z : " + map.get("z"));
		System.out.println("Write T : " + map.get("T"));
		System.out.println("Write c : " + map.get("c"));
		System.out.println("Write d : " + map.get("d"));
		
		map.remove("z");
		map.remove("T");
		map.remove("c");
		map.remove("d");
		System.out.println("Write z : " + map.get("z"));
		System.out.println("Write T : " + map.get("T"));
		System.out.println("Write c : " + map.get("c"));
		System.out.println("Write c : " + map.get("d"));
		
		map.put("z", 5);
		map.put("T", 5);
		map.put("c", 5);
		map.put("d", 5);
		System.out.println("Write z : " + map.get("z"));
		System.out.println("Write T : " + map.get("T"));
		System.out.println("Write c : " + map.get("c"));
		System.out.println("Write d : " + map.get("d"));
	}
}

public class CHM {
	public static void main(String[] args) {
		Map<String, Integer> map = new ConcurrentHashMap<String, Integer>();
		map.put("T", 1);
		map.put("d", 1);
		map.put("c", 1);
		map.put("z", 1);
		Thread t1 = new Thread(new CHMRead(map), "Read");
		Thread t2 = new Thread(new CHMWrite(map), "Write");
		t1.start();
		t2.start();
	}
}
