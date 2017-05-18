package com.ib.macmickey.exceptions;

public class PriceOutOfRangeException extends Exception {

	private static final long serialVersionUID = 1L;

	public PriceOutOfRangeException() {
		super("Prix maximum dépassé");
	}
	
}
