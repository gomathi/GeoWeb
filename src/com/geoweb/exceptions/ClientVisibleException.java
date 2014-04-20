/**
 * 
 */
package com.geoweb.exceptions;

/**
 * @author goms
 * 
 */
public class ClientVisibleException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ClientVisibleException(String message) {
		super(message);
	}

	public ClientVisibleException(String message, Throwable throwable) {
		super(message, throwable);
	}

}
