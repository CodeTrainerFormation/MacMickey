package com.ib.macmickey.entities;

import com.ib.macmickey.interfaces.Fries;

public class Potatoes implements Fries {

	@Override
	public float getPrice() {
		return 2.7f;
	}

	@Override
	public String getName() {
		return "Potatoes";
	}

}
