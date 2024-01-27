package com.javaBasics;

interface Addable {
	int add(int a, int b, int c);
}

public class LambdaAdd3Num {
	public static void main(String[] args) {
		Addable r = (a,b,c) ->{ return (a+b+c);};
		System.out.println(r.add(7, 10, 15));
	}
}
