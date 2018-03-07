package com.threads;

import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class MyRunnable implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("MyRunnable : " + Thread.currentThread().getName() + " : " + i);
		}
	}
}


class YourRunnable implements Callable<String> {

	@Override
	public String call() throws Exception {
		int count=0;
		for (int i = 1; i < 10; i++) {
			count++;
		}
		Thread.sleep(5000);
		return "Running App : " + 1;
	}
	
}


public class ExectorFramwork {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService exc = Executors.newFixedThreadPool(5);
		/*Future<?> one = exc.submit(new MyRunnable());
		Future<?> two = exc.submit(new MyRunnable());
		Future<?> three = exc.submit(new YourRunnable());*/
		Future<?> four = exc.submit(new YourRunnable());
		System.out.println("------------------------------------------------"+ four.get());
		System.out.println("Done");
	}
}
