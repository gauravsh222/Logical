package com.Util;

interface I {
	
}

class  A implements I {
	
}

class B implements I {
	
} 

public class CheckClassType {
	public static void main(String[] args) {
		I a = new A();
		I b = new B();
		
		System.out.println(a.getClass());
		System.out.println(b.getClass());
	}

}
