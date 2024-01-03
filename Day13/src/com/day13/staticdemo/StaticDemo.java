package com.day13.staticdemo;

class Employee
{
	// Instance Variable
	private String name;
	private int id;
	
	// Static Variable
	static String companyName = "Google";

	public Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", companyName="+ companyName + "]";
	}
	
	
	
}


public class StaticDemo {

	public static void main(String a[])
	{
		
	}
	
}
