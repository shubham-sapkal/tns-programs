package com.day19.wrapper;

public class WrapperDemo {

	public static void main(String args[])
	{
		
		// Auto boxing
		int a = 20;
		
		Integer aobj1 = Integer.valueOf(a);
		Integer bobj2 = a;
		Integer cobj3 = new Integer(a);   // Deprecated
		
		System.out.println(aobj1);
		System.out.println(bobj2);
		System.out.println(cobj3);
		
		// Unboxing
		
		int i = new Integer(aobj1); // Deprecated
		int j = bobj2;
		System.out.println(i);
		System.out.println(j);
		
		
		// Auto boxing of all classes
		Boolean bool = Boolean.valueOf(false);
		System.out.println("Boolean = " + bool);
		
		Character ch = Character.valueOf('S');
		System.out.println("Character = " + ch);
		
		Byte bytes = Byte.valueOf((byte) 137);
		System.out.println("Bytes = " + bytes);
		
		
		
		
		
	}
	
}
