package com.day18.String;

public class StringDemo {

	public static void main(String args[])
	{
		
		// String string objecy
		String s1 = new String("Shubham");
		System.out.println(s1);
		
		String s2 = "Namaste Duniya!";
		System.out.println(s2);
		
		char s3[] = {'C', 'H', 'A', 'R' };
		System.out.println(s3);
		
		// String method
		System.out.println("s1.charAt(1)" + s1.charAt(1) );
		
		
		System.out.println("S1 Length: " + s1.length());
		
		System.out.println("S1 equals shubham " + s1.equals("shubham"));
		System.out.println("S1 equals shubham " + s1.equalsIgnoreCase("shubham"));
		
	}
	
}
