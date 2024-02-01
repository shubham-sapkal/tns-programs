package com.day28.userdefinedtype;

import java.util.ArrayList;
import java.util.List;

class Student
{
	private String name;
	private int rollno;
	private String dept;
	public Student(String name, int rollno, String dept) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.dept = dept;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + ", dept=" + dept + "]";
	}
	
	
}


public class UserDefinedTypeDemo {

	public static void main(String[] args) {
		
		List<Student> studdata = new ArrayList<>();
		
		
		studdata.add(new Student("Shubham", 137, "Comp"));
		studdata.add(new Student("Himang", 128, "IT"));
				
		System.out.println(studdata);
		
		
		// Traversing using lambda expression
//		System
		studdata.forEach(stud -> System.out.println(stud));
		
		
	}

}
