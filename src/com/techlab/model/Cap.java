package com.techlab.model;

public class Cap implements Headwears{
	private int price;
	
	public Cap(int price) {
		this.price = price;
	}

	@Override
	public int getPrice() {
		return price;
	}
	
}
