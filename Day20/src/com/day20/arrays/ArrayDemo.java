package com.day20.arrays;

import java.util.Arrays;

public class ArrayDemo {

	public static void main(String args[])
	{
		
		// Creating Array
		int a[] = new int[5];
		
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		
		
		System.out.println("Array = " + Arrays.toString(a));	
		
		Arrays.sort(a);
		
		System.out.println("Array = " + Arrays.toString(a));	
	}
	
}

