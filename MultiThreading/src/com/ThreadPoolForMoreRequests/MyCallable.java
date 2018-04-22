package com.ThreadPoolForMoreRequests;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {

	private String str;
	
	public MyCallable(String str) {
		this.str=str;
	}
	
	@Override
	public String call() throws Exception {
		return new DAO().save(str);
	}

}
