package com.overriding;

class A { 
	Object m1() {
		return "Super";
	}
}

class B extends A {
	Integer m1() {
		return 1;
	}
}
public class Covarient {
	public static void main(String[] args) {
		A a = new B();
		System.out.println(a.m1());
	}
}
