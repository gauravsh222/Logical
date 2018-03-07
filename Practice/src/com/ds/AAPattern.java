package com.ds;

import java.util.Scanner;

public class AAPattern {
	public static void main(String[] args) {
		System.out.println((int)"A".charAt(0));
		Scanner sc = new Scanner(System.in);
		while (true) {
			int result = 0;
			System.out.println("Ënter Pattern");
			String str = sc.next();
			int len = str.length();
			int c = len-1;
			for (int i = 0; i < len; i++) {
				int ascii = str.charAt(i) - 'A' + 1;
				int pow = (int) Math.pow(26, c--);
				result += pow * ascii;
			}
			System.out.println(result);
		}
	}
}
