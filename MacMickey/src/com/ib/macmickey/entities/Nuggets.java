package com.ib.macmickey.entities;

import com.ib.macmickey.interfaces.Sandwich;

public class Nuggets implements Sandwich {

	@Override
	public float getPrice() {
		return 4.3f;
	}

	@Override
	public String getName() {
		return "Nuggets";
	}

}
