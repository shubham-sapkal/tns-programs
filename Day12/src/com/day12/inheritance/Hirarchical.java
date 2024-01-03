package com.day12.inheritance;


class Person
{
	private String name;
	private String city;
	private int age;
	
	
	public Person(String name, String city, int age) {
		super();
		this.name = name;
		this.city = city;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", city=" + city + ", age=" + age + "]";
	}
	
	
	
}

class Student extends Person 
{
	 private int sid;
	 private String collageName;
	 private String degreeName;
	 
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getCollageName() {
		return collageName;
	}
	public void setCollageName(String collageName) {
		this.collageName = collageName;
	}
	public String getDegreeName() {
		return degreeName;
	}
	public void setDegreeName(String degreeName) {
		this.degreeName = degreeName;
	}
	
	
	
	
	public Student(String name, String city, int age, int sid, String collageName, String degreeName) {
		super(name, city, age);
		this.sid = sid;
		this.collageName = collageName;
		this.degreeName = degreeName;
	}
	
	
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", collageName=" + collageName + ", degreeName=" + degreeName + ", getName()="
				+ getName() + ", getCity()=" + getCity() + ", getAge()=" + getAge() + "]";
	}
	 
	 
	 
}


class Employee extends Person
{
	private String companyName;
	private String empId;
	private String design;
	private String salary;
	
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getDesign() {
		return design;
	}
	public void setDesign(String design) {
		this.design = design;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	
	
	public Employee(String name, String city, int age, String companyName, String empId, String design, String salary) {
		super(name, city, age);
		this.companyName = companyName;
		this.empId = empId;
		this.design = design;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [companyName=" + companyName + ", empId=" + empId + ", design=" + design + ", salary=" + salary
				+ ", getName()=" + getName() + ", getCity()=" + getCity() + ", getAge()=" + getAge() + "]";
	}
	
	
	
}


public class Hirarchical {
	public static void main(String args[])
	{
		
		Student s1 = new Student("Shubham", "Mumbai", 21, 137, "GHRCEM", "B. Tech");
		
		System.out.println(s1);
		
		Employee e1 = new Employee("Shubham", "Mumbai", 21, "Google", "137", "SDE", "33,00,000" );
		
		System.out.println(e1);
		
		
		// Object referece
		
		
	}
}
