package com.day17.interfacetypes;

@FunctionalInterface
interface GreetInterface{
	
	void greet();
	
//	void print();
	
}

class GreetDemo implements GreetInterface{
	
	public void greet()
	{
		System.out.println("Ram Ram Bhai, ");	
	}
	
}



public class FunctionInterfaceDemo {

	public static void main(String[] args) {


		GreetDemo demo = new GreetDemo();
		demo.greet();

	}

}
