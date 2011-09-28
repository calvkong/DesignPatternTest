package com.test.patterns.decorator.model.fruit;

import com.test.patterns.decorator.model.Drink;

public class PomegranateParadise extends Drink {

	@Override
	public double getCost() {
		return 3.75;
	}

	@Override
	public String getDescription() {
		return "PomegranateParadise";
	}

}
