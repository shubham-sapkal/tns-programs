package com.day27.listdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

//import javax.swing.text.html.HTMLDocument.Iterator;

public class ArrayDemoGeneric {
	public static void main(String args[])
	{
		
		List<String> names = new ArrayList<String>();
		
		names.add("Shubham");
		names.add("Himang");
		names.add("Sandeep");
		names.add("Vishal");
//		names.add(null);
		names.add("Prachi");
		
		System.out.println("Names: " + names);
		
		Collections.sort(names);
		System.out.println("After Sort" + names);
		
		Collections.reverse(names);
		System.out.println("After Reverse: " + names);
		
		System.out.println("Names Contains: " + names.contains("Shubham"));
		
		
		// Itrator
		Iterator<String> i = names.iterator();
		while(i.hasNext())
		{
			String name = i.next();
			System.out.println("Name: " + name);
			
			if(name == "Shubham") {
				i.remove();
			}
		}
		
		
		
	}
}
