package com.day11.singleton;

public class LazyInitSingleton {

	// creating null object of class
	private static LazyInitSingleton instance = null;
	
	// making constructor private
	private LazyInitSingleton() {}

	
	// Global Access Method
	public static LazyInitSingleton getInstance()
	{
		if(instance == null )
			instance = new LazyInitSingleton();
		
		return instance;
	}
	
	// tesing data members
	int a;

	public int getA() {
		return a;
	}


	public void setA(int a) {
		this.a = a;
	}
	
	
	
}
