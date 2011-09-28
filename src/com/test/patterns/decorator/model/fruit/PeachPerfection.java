package com.test.patterns.decorator.model.fruit;

import com.test.patterns.decorator.model.Drink;

public class PeachPerfection extends Drink {

	@Override
	public double getCost() {
		return 3.25;
	}

	@Override
	public String getDescription() {
		return "PeachPerfection";
	}

}
