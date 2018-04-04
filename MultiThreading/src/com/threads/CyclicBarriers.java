package com.threads;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

class Producer implements Runnable {
	
	CyclicBarrier bar;
	
	public Producer(CyclicBarrier bar) {
		this.bar=bar;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			if(i==30) {
				try {
					System.out.println("Calling await : " + Thread.currentThread().getName());
					System.out.println("Count is ---------------------- " + Thread.currentThread().getName() + " : " + bar.await());
				} catch (InterruptedException | BrokenBarrierException e) {
					e.printStackTrace();
				}
			}
//			System.out.println("Count Down : " +  Thread.currentThread().getName() + " : " + i);
		}
		
	}
}

public class CyclicBarriers {
	public static void main(String[] args) {
		
		CyclicBarrier bar = new CyclicBarrier(3, new Runnable() {
			
			@Override
			public void run() {
				System.out.println("CyclicBarrier Called ");
			}
		});
		Producer w = new Producer(bar);
		
		Thread t1 = new Thread(w, "T1");
		Thread t2 = new Thread(w, "T2");
		Thread t3 = new Thread(w, "T3");
		
		t1.start();
		t2.start();
		t3.start();
		
		
		System.out.println("Main Done");
	}
}
