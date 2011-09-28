package com.test.patterns.decorator.model.fresh;

import com.test.patterns.decorator.model.Drink;

public class CarrotJuice extends Drink {

	@Override
	public double getCost() {
		return 2.50;
	}

	@Override
	public String getDescription() {
		return "Carrot Juice";
	}

}
