package com.arr;

class A{
	void m1(A a) {
		System.out.println("A");
	}
}

class B extends A  {
	void m1(B a) {
		System.out.println("B");
	}
}

public class F extends B {
	static void m1(F a) {
		System.out.println("F");
		throw new Error();
	}

	
	public static void main(String[] args) {
		/*A a = new F();
		B b = new F();
		b.m1(a);*/
		
		try {
			F.m1(null);
			
		} catch (Exception e) {
			System.out.println("ex");
		}
		finally {
			System.out.println("fin");
		}
		System.out.println("dofd");
	}
}
