package com.ib.macmickey.entities;

import com.ib.macmickey.interfaces.Sandwich;

public class BigMickey implements Sandwich {

	@Override
	public float getPrice() {
		return 2.7f;
	}

	@Override
	public String getName() {
		return "Big Mickey";
	}

}
