package com.ThreadPoolForMoreRequests;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class Service {

	public void process(String str) throws InterruptedException, ExecutionException {
		Future<String> future = Controller.exc.submit(new MyCallable(str));
		System.out.println(str + " Service...!");
//		System.out.println(future.get());
	}

}
