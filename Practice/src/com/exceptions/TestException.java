package com.exceptions;

public class TestException {
	public static void main(String[] args) {
		try {
			testException();
		} catch (MyException e) {
		}
	}

	private static void testException() throws MyException {
		int i=0;
		try {
			int res = i/0;
			System.out.println("Completed : " + res);
		} catch (ArithmeticException e) {
			System.out.println("Inside Catch");
			throw new MyException(e.getMessage(), e);
		}
	}
}
