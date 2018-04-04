package com.threads;


class Even implements Runnable {
	private Object lock;
	int i;
	public Even(Object lock) {
		this.lock=lock;
	}

	@Override
	public void run() {
		synchronized (lock) {
			while (i <= 10) {
				System.out.println("Even : " + i);
				i = i + 2;
				try {
					lock.notify();
					lock.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	} 
}

class Odd implements Runnable {
	private Object lock;
	int i=1;
	public Odd(Object lock) {
		this.lock=lock;
	}

	@Override
	public void run() {
		synchronized (lock) {
			while (i <= 10) {
				System.out.println("Odd : " + i);
				i = i + 2;
				try {
					lock.notify();
					lock.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	} 
}

public class PrintEvenOdd {
	public static void main(String[] args) throws InterruptedException {
		Object lock = new Object();
		Thread t1 = new Thread(new Even(lock), "Even");
		Thread t2 = new Thread(new Odd(lock), "Odd");
		t1.start();
		Thread.sleep(500);
		t2.start();
	}
}
