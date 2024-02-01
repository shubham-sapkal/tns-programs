package com.day27.listdemo;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList<Integer> ll = new LinkedList<Integer>();
		
		ll.add(10);
		ll.add(20);
		ll.add(40);
		
		ll.addFirst(5);   // Add First
		
		ll.add(4, 50);   // Add Middle
		
		ll.addLast(70);  // Add Last
		
		System.out.println("LL: " + ll);
		
		System.out.println("LL Head: " + ll.getFirst());
		System.out.println("LL Tail: " + ll.getLast());
		
		
		ll.removeFirst();
		System.out.println("LL after removeFirst: " + ll);
		
		ll.removeLast();
		System.out.println("LL after removeLast: " + ll);
		
		System.out.println("\nNext: ");
		ListIterator<Integer> li = ll.listIterator();
		while(li.hasNext())
		{
			System.out.print(li.next() + "\t");
		}
		
		System.out.println("\nPrev: ");
		li = ll.listIterator(ll.size());
		while(li.hasPrevious())
		{
			System.out.print(li.previous() + "\t");
		}
		
		
		
	}

}
