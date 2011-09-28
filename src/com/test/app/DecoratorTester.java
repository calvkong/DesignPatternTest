package com.test.app;

import com.test.patterns.decorator.model.Drink;
import com.test.patterns.decorator.model.decorator.boost.FlaxAndFiberBoost;
import com.test.patterns.decorator.model.decorator.boost.HeartHappyBoost;
import com.test.patterns.decorator.model.decorator.size.Large;
import com.test.patterns.decorator.model.decorator.size.Medium;
import com.test.patterns.decorator.model.decorator.size.Small;
import com.test.patterns.decorator.model.fresh.CarrotJuice;

public class DecoratorTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Drink drink = null; 
		drink = new FlaxAndFiberBoost(new Small(new CarrotJuice()));
		printDrink(drink);
		drink = new FlaxAndFiberBoost(new Medium(new CarrotJuice()));
		printDrink(drink);
		drink = new FlaxAndFiberBoost(new Large(new CarrotJuice()));
		printDrink(drink);
		drink = new FlaxAndFiberBoost(new HeartHappyBoost(new Small(new CarrotJuice())));
		printDrink(drink);
		drink = new FlaxAndFiberBoost(new HeartHappyBoost(new Medium(new CarrotJuice())));
		printDrink(drink);
		drink = new FlaxAndFiberBoost(new HeartHappyBoost(new Large(new CarrotJuice())));
		printDrink(drink);
		

	}

	private static void printDrink(Drink drink){
		System.out.println("------------------------------------");
		System.out.println("Description: " + drink.getDescription());
		System.out.println("Cost: $" + drink.getCost());
	}
}
