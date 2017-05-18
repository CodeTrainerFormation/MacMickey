package com.ib.macmickey.utils;

public class Utils {

	public static double round(double d, int nbDecimal) {
		double precision = Math.pow(10, nbDecimal);
		return Math.round(d * precision) / precision ;
	}
	
}
