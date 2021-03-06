package com.ds;

public class GCD {
	static int gcd(int a, int b) {
		if (a == 0)
			return b;

		return gcd(b % a, a);
	}

	static void findGCDUsingModulo(int a, int b) {
		int gcd=0;

		for (int i = 1; i <= a && i <= b; ++i) {
			// Checks if i is factor of both integers
			if (a % i == 0 && b % i == 0)
				gcd = i;
		}
		System.out.println(gcd);
	}
	
	static void usingSubstraction(int a, int b) {
		int sub;
		while (a != b) {
			sub = Math.abs(a-b);
		}
		System.out.println(a);
	}

	public static void main(String[] args) {
		int a = 10, b = 15, g;
//		g = gcd(a, b);
//		System.out.println("GCD(" + a + " , " + b + ") = " + g);
		usingSubstraction(a, b);
	}
}
