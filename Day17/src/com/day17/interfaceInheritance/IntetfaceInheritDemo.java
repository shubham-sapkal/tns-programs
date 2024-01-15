package com.day17.interfaceInheritance;

interface Interface1
{
	public void show();
}

//@FunctionalInterface
interface ExtendedInterface extends Interface1
{
	void print();
}

class Test implements ExtendedInterface
{
	@Override
	public void show()
	{
		System.out.println("Show ... ");
	}
	
	@Override
	public void print()
	{
		System.out.println("Print ... ");
	}
}

public class IntetfaceInheritDemo {

	public static void main(String[] args) {
		
		Test t1 = new Test();
		
		t1.show();
		t1.print();
		
		
	}

}
