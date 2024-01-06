package com.day15.cloneable;

class Student implements Cloneable
{
	// Data members
	private String name;
	private int id;
	private String dept;
	
	
	public Student(String name, int id, String dept) {
		this.name = name;
		this.id = id;
		this.dept = dept;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getDept() {
		return dept;
	}


	public void setDept(String dept) {
		this.dept = dept;
	}

	
	public void display()
	{
		System.out.println("Name: " + name);
		System.out.println("Id: " + id);
		System.out.println("Dept: " + dept);
	}
	
	public Student clone() throws CloneNotSupportedException
	{
		return (Student) super.clone();
	}
	
	
}



public class StudentDemo {

	public static void main(String a[]) throws CloneNotSupportedException
	{
		Student s1 = new Student("Student", 137, "CS");
		System.out.println(s1);
		s1.display();
		
		Student s2 = s1.clone();
		s2.setName("Himang");
		s2.setId(128);
		s2.setDept("Civil");
		System.out.println(s2);
		
		s2.display();
	}
	
	
}
