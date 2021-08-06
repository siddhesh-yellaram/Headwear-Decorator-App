package com.techlab.model;

public class GoldenPaintDecorator implements Headwears{
	private Headwears headwear;
	private int goldenPaintPrice = 500;
	
	public GoldenPaintDecorator(Headwears headwear) {
		this.headwear = headwear;
	}
	
	@Override
	public int getPrice() {
		return headwear.getPrice() + this.goldenPaintPrice;
	}
	
}
