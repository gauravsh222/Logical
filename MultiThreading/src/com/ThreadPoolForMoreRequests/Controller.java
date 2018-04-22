package com.ThreadPoolForMoreRequests;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Controller {
	
	public static ExecutorService exc;
	static {
		exc = Executors.newFixedThreadPool(2);
	}
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Service s = new Service();
		for (int i = 0; i < 10; i++) {
			s.process("ABC_"+i);
		}
		exc.shutdown();
	}
}
