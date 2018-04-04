package com.overriding;

class X {
	protected void m1()
	{
		System.out.println("X");
	}
}

class Y {
	protected void m1()
	{
		System.out.println("Y");
	}
}


public class ProtectedMethods {
	public static void main(String[] args) {
		X x = new X();
		x.removeEldestEntry();
	}

}
