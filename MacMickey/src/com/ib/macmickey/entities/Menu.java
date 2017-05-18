package com.ib.macmickey.entities;

import com.ib.macmickey.interfaces.*;
import com.ib.macmickey.utils.Utils;

public class Menu implements Product {

	private Sandwich sandwich;
	private Fries fries;
	private Soda soda;

	public Menu(Sandwich sandwich, Fries fries, Soda soda) {
		this.sandwich = sandwich;
		this.fries = fries;
		this.soda = soda;
	}

	@Override
	public float getPrice() {
		float p = (0.9f * (fries.getPrice() + soda.getPrice() + sandwich.getPrice()));
		double t = Utils.round(p, 2);
		return (float)t;
	}

	@Override
	public String getName() {
		
		return "Menu : " + fries.getName() + ", "
				+ soda.getName() + ", " 
				+ sandwich.getName();
	}

	public Sandwich getSandwich() {
		return sandwich;
	}

	public Fries getFries() {
		return fries;
	}

	public Soda getSoda() {
		return soda;
	}
	
	

}
