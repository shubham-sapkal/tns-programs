package com.day15.covarient;


// Parent
class Color
{
	protected Color getColor()
	{
		return new Color();
	}
}

// Child
class Red extends Color
{
	// Co Variance
	protected Red getColor()
	{
		return new Red();	
	}
}

class Green extends Color
{
	protected Green getColor()
	{
		return new Green();
	}
}

public class ColorDemo {

	public static void main(String[] args) {
		

		Red red = new Red();
		System.out.println("Red = " + red.getColor());
		
		Green green = new Green();
		System.out.print("Green = " + green.getColor());
		
		
	}

}
