package com.geoweb.exceptions;

public class SystemUnavailableException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SystemUnavailableException(String message) {
		super(message);
	}

	public SystemUnavailableException(String message, Throwable throwable) {
		super(message, throwable);
	}

}
