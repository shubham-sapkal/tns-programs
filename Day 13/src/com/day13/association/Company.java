package com.day13.association;

// Association: IS-A relationships


// Parent class - Entity class
class Employee {
	
	private String name;
	private int empid;
	private String dept;
	private int mobile;
	
	// Default constructor
	public Employee ()
	{}
	
	// Parameteried Constructor
	public Employee(String name, int empid, String dept, int mobile) {
		this.name = name;
		this.empid = empid;
		this.dept = dept;
		this.mobile = mobile;
	}
	
	// Getters and Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}


	@Override
	public String toString() {
		return "Employee [name=" + name + ", empid=" + empid + ", dept=" + dept + ", mobile=" + mobile + "]";
	}
	
	
}


// Child Class
class Manager extends Employee {
	
	private int teamSize;

	public Manager(String name, int empid, String dept, int mobile, int teamSize) {
		super(name, empid, dept, mobile);
		this.teamSize = teamSize;
	}

	public int getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}

	@Override
	public String toString() {
		return "Manager [teamSize=" + teamSize + ", getName()=" + getName() + ", getEmpid()=" + getEmpid()
				+ ", getDept()=" + getDept() + ", getMobile()=" + getMobile() + "]";
	}
	
	
}


public class Company {

	public static void main(String a[])
	{
		Employee emp = new Employee("ABC", 1, "SWE", 234234324);
		
		Manager man = new Manager("Shubham", 137, "SWE", 809710350, 10);
		
		System.out.println(emp);
		System.out.println(man);
		
	}
	
}
