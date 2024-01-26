package com.day23.exceptions;

import java.util.Arrays;

public class UncheckedException {

	public static void main(String args[])
	{
		
		int x[] = {10, 20, 30};
		
		System.out.println(Arrays.toString(x));
		
		
		try {
			System.out.println(x[10]);
		}
		catch(ArrayIndexOutOfBoundsException as)
		{
			System.err.println("Index out of Bound" + as.getMessage());
		}
		
					
		
		System.out.println("End Of the Program");
		
	}
	
}