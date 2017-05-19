package com.ib.macmickey.utils;

public class Utils {

	public static double round(double d, int nbDecimal) {
		
		double precision = Math.pow(10, nbDecimal);
		assert precision != 0 : "Division par zero";
		return Math.round(d * precision) / precision ;
	}
	
}
