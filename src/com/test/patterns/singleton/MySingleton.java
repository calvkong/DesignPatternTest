package com.test.patterns.singleton;

/**
 * Singleton Pattern class
 * 
 * @author Calvin Kong
 * @version 1.0.0
 *
 */
public class MySingleton {
	private MySingleton(){}
	
	private static class SingletonHolder{
		private static final MySingleton INSTANCE = new MySingleton();
	}
	
	public static MySingleton getInstance(){
		return SingletonHolder.INSTANCE;
	}
}
