package com.test.patterns.decorator.model.decorator.size;

import com.test.patterns.decorator.model.Drink;

public abstract class SizeDecorator extends Drink{
	
	protected Drink drink;
	
	public SizeDecorator(Drink drink){
		this.drink = drink;
	}

}
