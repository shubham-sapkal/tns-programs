package com.day13.association;

// Has-A Relation : person ------ address

// Contained Class
class Address
{
	// data members
	private String street;
	private String city;
	private String roomno;
	private String state;
	private int pincode;
	
	// Default
	public Address() {}
	
	// Parameterized
	public Address(String street, String city, String roomno, String state, int pincode) {
		this.street = street;
		this.city = city;
		this.roomno = roomno;
		this.state = state;
		this.pincode = pincode;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getRoomno() {
		return roomno;
	}

	public void setRoomno(String roomno) {
		this.roomno = roomno;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "[street=" + street + ", city=" + city + ", roomno=" + roomno + ", state=" + state + ", pincode="
				+ pincode + "]";
	}
	
	
	
	
}


// Container Class
class Person 
{
	private String name;
	private Address address; // Object Reference
	
	
	
	public Person(String name, Address address) {
		this.name = name;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

	
	public void display()
	{
		System.out.println("Name: " + name);
		System.out.println("Address: " + address.toString());
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + ", getName()=" + getName() + ", getAddress()="
				+ getAddress() + "]";
	}
	
}


public class HasARelationship {

	public static void main(String[] args) {
		
		Address address = new Address("Ramabai Nagar", "Mumbai", "Room NO 22","Maharashtra", 400075);
		
		Person p1 = new Person("Shubham", address);
		
		p1.display();
	}

}
