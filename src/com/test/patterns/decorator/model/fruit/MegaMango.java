package com.test.patterns.decorator.model.fruit;

import com.test.patterns.decorator.model.Drink;

public class MegaMango extends Drink {

	@Override
	public double getCost() {
		return 3.50;
	}

	@Override
	public String getDescription() {
		return "MegaMango";
	}

}
