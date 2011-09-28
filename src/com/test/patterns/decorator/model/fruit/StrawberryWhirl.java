package com.test.patterns.decorator.model.fruit;

import com.test.patterns.decorator.model.Drink;

public class StrawberryWhirl extends Drink {

	@Override
	public double getCost() {
		return 2.50;
	}

	@Override
	public String getDescription() {
		return "StrawberryWhirl";
	}

}
