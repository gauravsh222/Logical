package com.pattern.abstractfactory;

public class IP2 implements Endpoint {

	@Override
	public boolean connectCall() {
		System.out.println("Call is gettting connnected");
		return true;
	}

	@Override
	public boolean disconnectCall() {
		System.out.println("Call is disconnnected");
		return true;
	}

}
