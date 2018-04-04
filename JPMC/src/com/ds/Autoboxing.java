package com.ds;

class A {
//	void m1(String obj) {System.out.println("String");}
//	void m1(Object obj) {System.out.println("Object");}
	void m1(Integer obj) {System.out.println("Integer");}
	void m1(Long obj) {System.out.println("Long");}
//	void m1(long obj) {System.out.println("long");}
}

class B {
	void m1(Long l) {
		System.out.println("Long");
	}
	void m1(Short s) {
		System.out.println("Short");
	}
	void m1(long i) {
		System.out.println("int");
	}
}


public class Autoboxing {
	public static void main(String[] args) {
		A a = new A();
//		a.m1(null);
		
		B b = new B();
		short y=6;
		long z=7;
		b.m1(y);
		b.m1(z);
	}
}

