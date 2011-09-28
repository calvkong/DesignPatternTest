package com.test.patterns.decorator.model.decorator.size;

import com.test.patterns.decorator.model.Drink;

public class Large extends SizeDecorator {

	public Large(Drink drink) {
		super(drink);
	}

	@Override
	public double getCost() {
		return drink.getCost() * 1.50;
	}

	@Override
	public String getDescription() {
		return "Large " + drink.getDescription();
	}
}
