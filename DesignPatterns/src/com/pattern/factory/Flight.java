package com.pattern.factory;

public class Flight implements Way {

	@Override
	public void travel() {
		System.out.println("Travelling By Air");
	}

}
