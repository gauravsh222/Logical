package com.pattern.factory;

public class Bus implements Way {

	@Override
	public void travel() {
		System.out.println("Travelling By Road");
	}

}
