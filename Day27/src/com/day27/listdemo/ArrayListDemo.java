package com.day27.listdemo;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {

		List list1 = new ArrayList(); // Dynamic Binding
		
		list1.add(10);
		list1.add(20);
		list1.add("Shubham");
		list1.add("Himang");
		list1.add(false);
		list1.add(10);
		list1.add(20);
		list1.add(12.4f);
		
		System.out.println("List is: " + list1);
		
		System.out.println("List isEmpty: " + list1.isEmpty());
		System.out.println("List size: " + list1.size());
		System.out.println("List Contains: " + list1.contains("Himang"));
		System.out.println("List Contains: " + list1.contains(15) );
		
		// Remove by index
		list1.remove(2);
		System.out.println("List After Remove: " + list1);
		
		System.out.println("List Get(2): " + list1.get(2));
		
		System.out.println("List lastIndexOf(10): " + list1.lastIndexOf(10));
		
		// Remove last 10
		list1.remove(list1.indexOf(10));
		System.out.println("List After Last Remove: " + list1);
		
		// Sort
//		Collections.sort(list1); // It will throw an error CastCastException
								// Cause Element in list1 are not in Same Type
		
		
		List list2 = new ArrayList();
		
		list2.add(20);
		list2.add(1);
		list2.add(40);
		list2.add(35);
		list2.add(-5);
		
		System.out.println("Before Sort: " + list2);
		Collections.sort(list2);
		System.out.println("After Sort: " + list2);
		
		
		
	}

}
