package com.day11.singleton;

public class EarlyInitSingleton {
	
	// creating private static object of this class
	private static EarlyInitSingleton instance = new EarlyInitSingleton();
	
	// Make constructor private, to avoid instantiation of this class
	private EarlyInitSingleton() {
		
	}
	
	// create 
	public static EarlyInitSingleton getInstance() 
	{
		return instance;
	}
	
}
