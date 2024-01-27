package com.Collection;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapEx extends Thread{
	private static HashMap<String, Integer> hm = new HashMap<String, Integer>();

	/*
	 * public void run() { hm.put("Four", 4); }
	 */
	public static void main(String[] args) {
		hm.put("One", 1);
		hm.put("Two", 2);
		hm.put("Three", 3);
		ConcurrentHashMapEx t1 = new ConcurrentHashMapEx();
		t1.start();
		for (Object o : hm.entrySet()) {
			System.out.println(o);
		}
		System.out.println(hm);
	}
}

