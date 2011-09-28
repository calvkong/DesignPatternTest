package com.test.patterns.decorator.model.fresh;

import com.test.patterns.decorator.model.Drink;

public class OrangeJuice extends Drink {

	@Override
	public double getCost() {
		return 2.25;
	}

	@Override
	public String getDescription() {
		return "Orange Juice";
	}

}
