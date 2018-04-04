package com.threads;

public class Locks {
	
	
	public static synchronized void m1() {
		for (int i = 0; i < 100; i++) {
			System.out.println("m1 : " + i);
		}
	}
	
/*	public static void m2() {
//		synchronized (Locks.class) {
			for (int i = 0; i < 100; i++) {
				System.out.println("m2 : " + i);
			}
//		}
	}*/
	
	public void m2() {
		synchronized (Object.class) {
			for (int i = 0; i < 100; i++) {
				System.out.println("m2 : " + i);
			}
		}
	}
	
	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				m1();
			}
		});
		t1.start();
		
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				new Locks().m2();
//				m2();
			}
		});
		t2.start();
	}
}
