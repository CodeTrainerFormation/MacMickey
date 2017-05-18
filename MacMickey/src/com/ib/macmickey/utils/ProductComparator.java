package com.ib.macmickey.utils;

import java.util.Comparator;

import com.ib.macmickey.interfaces.Product;

public class ProductComparator implements Comparator<Product> {

	@Override
	public int compare(Product p1, Product p2) {
		if(p1.getPrice() > p2.getPrice()) {
			return 1;
		} else if(p1.getPrice() < p2.getPrice()) {
			return -1;
		} else {
			return 0;
		}
	}

}
