package com.day11.singleton;

public class DriverClass {

	public static void main(String args[])
	{
			
		// Creating object 
		LazyInitSingleton obj = LazyInitSingleton.getInstance();
		obj.setA(30);
		
		LazyInitSingleton obj1 = LazyInitSingleton.getInstance();
		
		obj1.setA(10);
		
		System.out.println(obj);
		System.out.println(obj1);
		
		System.out.println("A = " + obj.getA());
		
	}
	
}
