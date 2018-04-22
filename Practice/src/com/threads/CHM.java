package com.threads;

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
		try { System.out.println("Read Sleeping"); Thread.sleep(2000); } catch
		 (InterruptedException e) { e.printStackTrace(); }
		/*Iterator<Entry<String, Integer>> it = entrySet.iterator();
		while (it.hasNext()) {
			System.out.println("Found Element");
			Entry<String, Integer> next = it.next();
			System.out.println("Read : " + next.getKey() + " : " + next.getValue());
		}*/
		
		for(Entry<String, Integer> entry : entrySet) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}
}

class CHMWrite implements Runnable {

	 Map<String, Integer> map;

	public CHMWrite(Map<String, Integer> map) {
		this.map = map;
	}

	@Override
	public void run() {
		/*try {
			System.out.println("Write Sleeping");
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
		map.put("A", 2);
		System.out.println("Write : " + map.get("A"));
		map.remove("A");
		System.out.println("Write : " + map.get("A"));
	}

}

public class CHM {
	volatile Map<String, Integer> map ;
	public static void main(String[] args) {
		CHM c = new CHM();
		c.map = new ConcurrentHashMap<String, Integer>();
		c.map.put("A", 1);
		Thread t1 = new Thread(new CHMRead(c.map), "Read");
		Thread t2 = new Thread(new CHMWrite(c.map), "Write");
		t1.start();
		t2.start();
	}
}
