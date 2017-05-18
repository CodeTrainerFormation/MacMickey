package com.ib.macmickey.entities;

import com.ib.macmickey.interfaces.Soda;

public class Cola implements Soda {

	@Override
	public float getPrice() {
		return 1.5f;
	}

	@Override
	public String getName() {
		return "Cola";
	}

}
