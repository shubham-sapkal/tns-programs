package com.day17.interfacetypes;

//@MarkerInterface
interface isRegistered{
	
}

class Student implements isRegistered
{
	public static void isRegistered()
	{
		System.out.println("Yes, Student is Registered For the class ... ");
	}
}


public class MarkerInterfaceDemo {
	public static void main(String args[])
	{
		
		Student shuu = new Student();
		
		shuu.isRegistered();
		
	}
}
