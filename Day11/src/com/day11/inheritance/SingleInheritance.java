package com.day11.inheritance;


class Person
{
	// Data members
	private String name;
	private int id;
	private String address;
	private int age;
	private	String birthPlace;
	
	public Person(String name, int id, String address, int age, String birthPlace)
	{
		this.name = name;
		this.id = id;
		this.address = address;
		this.age = age;
		this.birthPlace = birthPlace;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBirthPlace() {
		return birthPlace;
	}

	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + ", address=" + address + ", age=" + age + ", birthPlace="
				+ birthPlace + "]";
	}
	
	
}

class Student extends Person 
{
	private int rollno;
	private String collageName;
	private String branch;
	
	public Student(String name, int id, String address, int age, String birthPlace, int rollno, String collageName, String branch) {
		super(name, id, address, age, birthPlace);
		this.rollno = rollno;
		this.collageName = collageName;
		this.branch = branch;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getCollageName() {
		return collageName;
	}

	public void setCollageName(String collageName) {
		this.collageName = collageName;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", collageName=" + collageName + ", branch=" + branch + ", getName()="
				+ getName() + ", getId()=" + getId() + ", getAddress()=" + getAddress() + ", getAge()=" + getAge()
				+ ", getBirthPlace()=" + getBirthPlace() + "]";
	}

	
}


public class SingleInheritance {

	public static void main(String args[])
	{
		
		Student s1 = new Student("Shubham", 137, "Pune", 21, "Mumbai", 137, "GHRCEM", "Comp" );
		
		System.out.print(s1);
		
	}
	
}
