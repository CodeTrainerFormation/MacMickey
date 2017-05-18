package com.ib.macmickey.entities;

import com.ib.macmickey.interfaces.Soda;

public class IcedTea implements Soda {

	@Override
	public float getPrice() {
		return 1.7f;
	}

	@Override
	public String getName() {
		return "Iced Tea";
	}

}
