package com.day17.nestedinterface;

interface OuterInterface
{
	void calArea();
	
	interface InnnerInterface
	{
		int id = 20;
		void print();
	}
}

//class NestedDemo implements 


public class NestedInterfaceDemo implements OuterInterface, OuterInterface.InnnerInterface
{
	public void calArea()
	{
		System.out.println("Calculated Area ... ");
	}
	
	public void print()
	{
		System.out.println("Print from Inner Interface");
	}
	
	
	public static void main(String a[])
	{
		NestedInterfaceDemo demo = new NestedInterfaceDemo();
		
		demo.calArea();
		demo.print();
	}
	
}
