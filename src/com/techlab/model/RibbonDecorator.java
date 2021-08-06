package com.techlab.model;

public class RibbonDecorator implements Headwears{
	private Headwears headwear;
	private int ribbonPrice = 300;
	
	public RibbonDecorator(Headwears headwear) {
		this.headwear = headwear;
	}

	@Override
	public int getPrice() {
		return headwear.getPrice() + this.ribbonPrice;
	}
}
