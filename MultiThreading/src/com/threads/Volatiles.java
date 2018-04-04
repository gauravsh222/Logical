package com.threads;

import java.util.concurrent.CountDownLatch;

class MyRunnable implements Runnable {
	volatile int count=0;
	CountDownLatch latch;
	public MyRunnable(CountDownLatch latch) {
		this.latch=latch;
	}
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + ++count);
		}
		latch.countDown();
	}
}


public class Volatiles {
	public static void main(String[] args) throws InterruptedException {
		CountDownLatch count  = new CountDownLatch(2);
		
		MyRunnable a = new MyRunnable(count);
		Thread t1 = new Thread(a, "T1");
		Thread t2 = new Thread(a, "T2");
		
		t1.start();
		t2.start();
		
		count.await();
		System.out.println(Thread.currentThread().getName() + "Main : " + count.getCount());
		
	}
}
