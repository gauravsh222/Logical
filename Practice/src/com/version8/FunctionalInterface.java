package com.version8;

interface I1 {
	void m1();
	default void m2() {
		System.out.println("I1");
	}
}

interface I2 {
	void m1();
	default void m2() {
		System.out.println("I1");
	}
}

public class FunctionalInterface implements I1,I2 {

	@Override
	public void m1() {
	}
	public void m2() {
		System.out.println("I1");
	}
}
