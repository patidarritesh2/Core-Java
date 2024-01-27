package com.javaBasics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Stream;



public final class ImmutableList {
	public static void main(String[] args) {

		// List<String> list1 =List.of("one","two","three");

		System.out.println("----------------------------------------------");
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list = Collections.unmodifiableList(list);
		list.forEach(li -> System.out.print(li+" "));
		
		
		
	}
}
