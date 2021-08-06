package com.techlab.model;

public class Hat implements Headwears{
	private int price;
	
	public Hat(int price) {
		this.price = price;
	}
	
	@Override
	public int getPrice() {
		return price;
	}
	
}
