package com.exceptions;

public class MyException extends Exception {

	private static final long serialVersionUID = -7572837359244904800L;
	public MyException() {
	}
	public MyException(String msg) {
		super(msg);
	}
	public MyException(String message, Throwable cause) {
		super(message, cause);
	}
}
