package com.day23.exceptions;


class TryCatch
{
	static void divide(int a, int b)
	{	
		try {
			int ans = a/b;
			System.out.println("Divide: " + ans);
			
			int arr[]= {1, 2, 3, 4, 5};
			
			System.out.print(arr[ans]);
			
		}
		catch(ArithmeticException ae)
		{
			System.err.print(ae.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException ae) {
			System.err.print(ae.getMessage());
		}
		
	}
}

public class TryCatchDemo {

	public static void main(String[] args) {
		
		TryCatch.divide(12, 2);

	}

}
