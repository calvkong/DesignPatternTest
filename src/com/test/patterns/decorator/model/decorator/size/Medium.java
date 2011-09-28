package com.test.patterns.decorator.model.decorator.size;

import com.test.patterns.decorator.model.Drink;

public class Medium extends SizeDecorator {

	public Medium(Drink drink) {
		super(drink);
	}

	@Override
	public double getCost() {
		return drink.getCost() * 1.25;
	}

	@Override
	public String getDescription() {
		return "Medium " + drink.getDescription();
	}
}
