package com.test.patterns.singleton;

public class MySingleton {
	private MySingleton(){}
	
	private static class SingletonHolder{
		private static final MySingleton INSTANCE = new MySingleton();
	}
	
	public static MySingleton getInstance(){
		return SingletonHolder.INSTANCE;
	}
}
