package com.day24.throwsdemo;

import java.util.Scanner;

//import com.day24.throwsdemo.GreaterValueException;
//import com.day24.throwsdemo.NegativeValueException;

public class ThrowsDemo {

	static int acceptNumber() {
		
		Scanner get = new Scanner(System.in);
		int n = get.nextInt();
		get.close();
		
		return n;
		
	}
	
	static int calc(int a, int b) throws ArithmeticException
	{
		return a/b;
	}
	
	public static void main(String argsp[])
	{
		
		System.out.println("Enter Your Percentage: ");
		int percent = ThrowsDemo.acceptNumber();
		
		try {
			
			if(percent < 0)
				throw new GreaterValueException("Percentage should Not Less Than 0");
			else if(percent > 100)
				throw new NegativeValueException("Percetage Should Not Greater Than 100");
			else {
				System.out.println("Valid Percentage");
			}
		
		}
		catch(GreaterValueException gr)
		{
			System.err.println("Error: " + gr.getMessage());
		}
		catch(NegativeValueException ng)
		{
			System.err.println("Error: " + ng.getMessage());
		}
		catch(ArithmeticException ar)
		{
			System.err.println("Error: " + ar.getMessage());
		}
		
		System.out.println("Throws: " + ThrowsDemo.calc(10, 0));
		
	}
	
}
