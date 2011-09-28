package com.test.patterns.decorator.model.decorator.boost;

import com.test.patterns.decorator.model.Drink;
import com.test.patterns.decorator.model.decorator.size.SizeDecorator;

public abstract class BoostDecorator extends Drink{
	
	protected Drink drink;
	
	public BoostDecorator(SizeDecorator drink){
		this.drink = drink;
	}
	
	public BoostDecorator(BoostDecorator drink){
		this.drink = drink;
	}
	
}
