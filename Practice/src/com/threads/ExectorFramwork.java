package com.threads;

import java.lang.Thread.UncaughtExceptionHandler;
import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;


class ExceptionHandler implements UncaughtExceptionHandler {

	@Override
	public void uncaughtException(Thread t, Throwable e) {
		System.out.println("Exeption Caught for Thread Name - " + t.getName() + ",  and Exception type is " + Arrays.toString(e.getStackTrace()));
	}
	
}


class MyRunnable1 implements Runnable {

	@Override
	public void run() {
		try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		for (int i = 0; i < 1000; i++) {
			System.out.println("MyRunnable1_"+i);
		}
		System.out.println("-------------------");
		
	}
}

class MyRunnable2 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("MyRunnable2_"+i);
		}
		System.out.println("-------------------");
		throw new RuntimeException();
		/*try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}
}

class MyRunnable3 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("MyRunnable3_"+i);
		}
		System.out.println("-------------------");
		throw new RuntimeException();
		/*try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}
}

class ExeptionRunnable implements Runnable {

	@Override
	public void run() {
		throw new RuntimeException();
	}
}

class YourRunnable implements Callable<String> {

	@Override
	public String call() throws Exception {
		for (int i = 1; i < 1000; i++) {
			if(i==50)
				Thread.sleep(1000);
			System.out.println("YourRunnable_"+i);
		}
		
		return "Running App : " + 1;
	}
	
}


public class ExectorFramwork {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService exc = Executors.newFixedThreadPool(5);
		/*ThreadPoolExecutor pool = (ThreadPoolExecutor) exc;
		System.err.println("Before Size : " + pool.getCorePoolSize());
		System.err.println("After Active Count : " + pool.getActiveCount());
		System.err.println("Before Pool Size : " + pool.getPoolSize());*/
		Future<?> one = exc.submit(new YourRunnable());
		exc.shutdown();
		/*Future<?> two = exc.submit(new MyRunnable2());
		Future<?> three = exc.submit(new MyRunnable3());
		Future<?> four = exc.submit(new YourRunnable());
		Future<?> five = exc.submit(new ExeptionRunnable());*/
		
		
//		System.out.println("------------------------------------------------"+ four.get());
		
		/*System.err.println("After Size : " + pool.getCorePoolSize());
		System.err.println("After Active Count : " + pool.getActiveCount());
		System.err.println("After Pool Size : " + pool.getPoolSize());*/
		
	}
}
