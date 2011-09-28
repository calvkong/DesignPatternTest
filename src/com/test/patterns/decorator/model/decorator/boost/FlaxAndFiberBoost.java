package com.test.patterns.decorator.model.decorator.boost;

import com.test.patterns.decorator.model.decorator.size.SizeDecorator;

public class FlaxAndFiberBoost extends BoostDecorator {

	public FlaxAndFiberBoost(SizeDecorator drink) {
		super(drink);
	}

	public FlaxAndFiberBoost(BoostDecorator drink) {
		super(drink);
	}

	@Override
	public double getCost() {
		return drink.getCost() + 0.50;
	}

	@Override
	public String getDescription() {
		return "FlaxAndFiberBoosted " + drink.getDescription();
	}

}
