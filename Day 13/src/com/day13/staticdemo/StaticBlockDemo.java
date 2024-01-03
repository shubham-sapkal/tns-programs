package com.day13.staticdemo;

class Test
{
	private int section;  // Non Static
	static private int section2;  // Non Static
	static int srNo1=0; // Static
	static int srNo2=0; // Static
	
	
	// Static Block
	static {
		System.out.println("In Static Block");
		srNo1++;
	}


	public Test(int section, int section2) {
		this.section = section;
		this.section2 = section2;
		srNo2++;
	}


	@Override
	public String toString() {
		return "Test [section=" + section + ", section2=" + section2 + ", static1 = " + srNo1+ ", static2 = " + srNo2 + "]";
	}
	
	
}


public class StaticBlockDemo {

	public static void main(String args[])
	{
		Test t1 = new Test(101, 102);
		
		Test t2 = new Test (202, 203);
		
		System.out.println(t2);
		System.out.println(t1);
		
		
		Test t3 = new Test(303, 304);
		
		
		System.out.println(t3);
		
		System.out.println("Static Variable 1: " + Test.srNo1);
		System.out.println("Static Variable 2: " + Test.srNo2);
	}
	
}
