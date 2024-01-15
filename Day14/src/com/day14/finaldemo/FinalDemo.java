package com.day14.finaldemo;


class Test
{
	final int a; // Not accept, it should be initialized while declearing
	final int b = 10; // Accepted, it is constants, value cant be changed
	
	static final int c; // Accept only if initialized in static block
	static final int d; // Not Accept cause not intialized in static block 
	
	static {
		c = 30;
	}
	
	public static void fun() {
		a = 50;  // Not accepted,
		b = 60;  // Final Variable cant be reinitlized  
		d = 20;  
	}
	
}



public class FinalDemo {

	public static void main(String args[])
	{
		
	}
	
}
