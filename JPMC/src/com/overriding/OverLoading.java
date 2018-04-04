package com.overriding;

public class OverLoading {

	static {
//		i=20;
//		m2();
		System.out.println(i);
	}
	static int i=10;
	
	
	public static void m2() {
		i=30;
		System.out.println(i);	
	}
	
	public static void main(String[] args) {
//		m1(10);
	}

	/*private static void m1(int i) {
		System.out.println("int");
	}*/
	/*private static void m1(long l) {
		System.out.println("long");
	}*/
	
	private static void m1(Integer f) {
		System.out.println("Float");
	}

	private static void m1(Double f) {
		System.out.println("Double");
	}
	
}
