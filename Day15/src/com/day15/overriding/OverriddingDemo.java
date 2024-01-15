package com.day15.overriding;

class RBI
{
//	private float rateOfInterest = 8.0f;
	
	public float getROI()
	{
		return 7.1f;
	}
	
}

class ICICI extends RBI
{
	
	public float getROI()
	{
		return 12.5f;
	}

}

class SBI extends RBI
{
	public float getROI()
	{
		return 9.4f;
	}
}

class Axis extends RBI
{
	public float getROI()
	{
		return 18.2f;
	}
}




public class OverriddingDemo {

}
