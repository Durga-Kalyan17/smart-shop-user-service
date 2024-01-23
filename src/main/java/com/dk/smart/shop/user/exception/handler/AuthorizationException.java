package com.dk.smart.shop.user.exception.handler;


public class AuthorizationException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1919390763733323112L;

	public AuthorizationException(String message) {
		super(message);
	}
}
