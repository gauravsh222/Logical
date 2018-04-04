package com.barcley;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class A {
	void eat(A a) {
		System.out.println("A");
	}
}

class B extends A {
	void eat(B b) {
		System.out.println("B");
	}
}

class C extends B {
	void eat(C c) {
		System.out.println("C");
	}
}


public class TestClass {
	public static void main(String[] args) {
		A a = new C();
		B b = new C();
		b.eat(a);
		List<Integer> l = new ArrayList();
		l.iterator();
	}
}
