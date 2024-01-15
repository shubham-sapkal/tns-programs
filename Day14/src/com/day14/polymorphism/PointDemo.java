package com.day14.polymorphism;

class Point
{
	private float x;
	private float y;
	
	public Point()
	{
		this.x = 0.0f;
		this.y = 0.0f;
	}

	public Point(float x, float y) {
		this.x = x;
		this.y = y;
	}
	
	public Point(float x) {
		this.x = x;
		this.y = 0.0f;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	
	
	
}



public class PointDemo {

	public static void main(String a[])
	{
		Point p1 = new Point();
		
		System.out.println(p1);
		
		Point p2 = new Point(2.5f, 7.8f);
		
		System.out.println(p2);
		
		Point p3 = new Point(5.4f);
		
		System.out.println(p3);
	}	
	
}
