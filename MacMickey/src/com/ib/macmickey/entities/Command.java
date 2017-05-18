package com.ib.macmickey.entities;

import java.util.ArrayList;
import java.util.List;

import com.ib.macmickey.exceptions.PriceOutOfRangeException;
import com.ib.macmickey.interfaces.Product;
import com.ib.macmickey.utils.ProductComparator;

public class Command {

	private List<Product> products;
	private float maxPrice;
	
	public Command(float _maxPrice) {
		this.maxPrice = _maxPrice;
		this.products = new ArrayList<Product>();
	}
	
	public void addProduct(Product p) throws PriceOutOfRangeException {
		if(this.maxPrice != 0 && this.getPrice() + p.getPrice() > this.maxPrice) {
			throw new PriceOutOfRangeException();
		}
		this.products.add(p);
	}
	
	public void sortProductsByPrice() {
		this.products.sort(new ProductComparator());
	}
	
	public float getPrice() {
		float price = 0;
		
		for(Product p : this.products) {
			price += p.getPrice();
		}
		
		return price;
	}

	public List<Product> getProducts() {
		return products;
	}

	public float getMaxPrice() {
		return maxPrice;
	}
	
	
	
}
