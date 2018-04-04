package com.threads;

import java.util.concurrent.CountDownLatch;

class Worker implements Runnable {
	
	CountDownLatch latch;
	
	public Worker(CountDownLatch latch) {
		this.latch=latch;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			if(i==30) {
				System.out.println("Calling await : " + Thread.currentThread().getName());
				latch.countDown();
			}
			System.out.println("Count Down : " +  Thread.currentThread().getName() + " : " + i);
		}
	}
}

public class CountDownLatchs {
	public static void main(String[] args) {
		CountDownLatch latch = new CountDownLatch(3);
		Worker w = new Worker(latch);
		
		Thread t1 = new Thread(w, "T1");
		Thread t2 = new Thread(w, "T2");
		Thread t3 = new Thread(w, "T3");
		
		t1.start();
		t2.start();
		t3.start();
		
		try {
			latch.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Main Done");
		
	}
}
