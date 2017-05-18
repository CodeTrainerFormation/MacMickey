package com.ib.macmickey.entities;

import java.util.Currency;
import java.util.Locale;

import com.ib.macmickey.exceptions.PriceOutOfRangeException;
import com.ib.macmickey.interfaces.Fries;
import com.ib.macmickey.interfaces.Product;
import com.ib.macmickey.interfaces.Sandwich;
import com.ib.macmickey.interfaces.Soda;

public class Client {
	
	private Command command;
	
	public Client(float mp) {
		this.command = new Command(mp);
	}
	
	public Client() {
		this.command = new Command(0);
	}
	
	public void askFor(Product p) {
		try {
			this.command.addProduct(p);
		} catch (PriceOutOfRangeException e) {
			System.err.println(e.getMessage());
		}
	}
	
	public void askFor(Product p, int quantity) {
		try {
			while(quantity > 0) {
				this.command.addProduct(p);
				quantity--;
			}
		} catch (PriceOutOfRangeException e) {
			System.err.println(e.getMessage());
		}
	}
	
	public void askForMenus(Sandwich sdw, Fries fries, Soda soda) {
		try {
			this.command.addProduct(new Menu(sdw, fries, soda));
		} catch (PriceOutOfRangeException e) {
			System.err.println(e.getMessage());
		}
	}
	
	public void showCommand() {
		System.out.println(this.generateDetailCommand());
	}
	
	public String generateDetailCommand() {
		Currency cur = Currency.getInstance(Locale.getDefault());
		StringBuffer sb = new StringBuffer("Detail Commande");
		sb.append("\n");
		
		for(Product p : this.command.getProducts()) {
			sb.append(p.getName());
			sb.append("\t");
			sb.append(p.getPrice());
			sb.append(cur.getSymbol());
			sb.append("\n");
		}
		
		sb.append("**************");
		sb.append("\n");
		sb.append("Total");
		sb.append("\t");
		sb.append(this.command.getPrice());
		sb.append(cur.getSymbol());
		
		return sb.toString();
	}
	
	public void sortCommand() {
		this.command.sortProductsByPrice();
	}
	
	public void showLeftMoney() {
		float rest = this.command.getMaxPrice() - this.command.getPrice();
		System.out.println(rest);
	}
}
