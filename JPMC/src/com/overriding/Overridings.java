package com.overriding;

import java.io.IOException;

class Super {
	void m1() throws Exception  {
		System.out.println("Super");
	}
	void m1(int i) {
		System.out.println("Super");
	}
	void m1(long l) {
		System.out.println("Super");
	}
}

class Sub extends Super {
	@Override
	void m1() throws IOException {
		System.out.println("Sub");
	}
}

public class Overridings {
	public static void main(String[] args) throws Exception {
		Super s = new Sub();
		s.m1();
	}
}
