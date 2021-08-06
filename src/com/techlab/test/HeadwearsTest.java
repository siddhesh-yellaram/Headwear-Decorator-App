package com.techlab.test;

import com.techlab.model.Cap;
import com.techlab.model.GoldenPaintDecorator;
import com.techlab.model.Hat;
import com.techlab.model.Headwears;
import com.techlab.model.RibbonDecorator;

public class HeadwearsTest {

	public static void main(String[] args) {
		Headwears stdCap = new Cap(200);
		Headwears stdHat = new Hat(300);
		Headwears ribbonedHat = new RibbonDecorator(new Hat(350));
		Headwears goldenCap = new GoldenPaintDecorator(new Cap(260));
		Headwears goldenRibbonedHat = new GoldenPaintDecorator(new RibbonDecorator(new Hat(300)));
		
		System.out.println("Standard Hat Price: "+stdHat.getPrice());
		System.out.println("Standard Cap Price: "+stdCap.getPrice());
		System.out.println("Ribboned Hat Price: "+ribbonedHat.getPrice());
		System.out.println("Golden Cap Price: "+goldenCap.getPrice());
		System.out.println("Golden Ribboned Hat Price: "+goldenRibbonedHat.getPrice());
	}

}
