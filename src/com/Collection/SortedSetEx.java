package com.Collection;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetEx {

	public static void main(String[] args) {
		SortedSet s= new TreeSet();
		s.add("A");
		s.add("B");
		s.add("D");
		s.add("Z");
		
		System.out.println(s);
		System.out.println(s.first());
		System.out.println(s.last());
		System.out.println(s.comparator());
		System.out.println(s.headSet("D"));//is ke baad ki value print nahi hogi
		System.out.println(s.tailSet("B"));//isme is ke baad ki sari value print hogi
		System.out.println(s.subSet("A", "D"));
		
	}
}
