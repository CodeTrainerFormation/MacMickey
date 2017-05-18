package com.ib.macmickey.entities;

import com.ib.macmickey.interfaces.Fries;

public class FrenchFries implements Fries {

	@Override
	public float getPrice() {
		return 1.9f;
	}

	@Override
	public String getName() {
		return "French fries";
	}

}
