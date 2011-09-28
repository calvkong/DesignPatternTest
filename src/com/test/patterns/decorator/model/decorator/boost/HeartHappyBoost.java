package com.test.patterns.decorator.model.decorator.boost;

import com.test.patterns.decorator.model.decorator.size.SizeDecorator;

public class HeartHappyBoost extends BoostDecorator {

	public HeartHappyBoost(SizeDecorator drink) {
		super(drink);
	}

	@Override
	public double getCost() {
		return drink.getCost() + 0.25;
	}

	@Override
	public String getDescription() {
		return "HeartHappyBoosted " + drink.getDescription();
	}

}
