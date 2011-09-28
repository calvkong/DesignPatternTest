package com.test.patterns.decorator.model.decorator.size;

import com.test.patterns.decorator.model.Drink;

public class Small extends SizeDecorator {

	public Small(Drink drink){
		super(drink);
	}
	
	@Override
	public double getCost() {
		return drink.getCost();
	}

	@Override
	public String getDescription() {
		return "Small " + drink.getDescription();
	}

}
