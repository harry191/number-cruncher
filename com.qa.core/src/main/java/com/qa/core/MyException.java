package com.qa.core;

public class MyException extends Exception {

	private String message;
	
	public MyException(String msg) {
		message = msg;
	}
	
	public String getMessage() {
		return message;
	}
	
}
