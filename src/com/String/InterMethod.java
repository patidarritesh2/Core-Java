package com.String;

public class InterMethod {

	public static void main(String[] args) {
		String p = "Hello";
		String r="vinayak";
		String q =p.concat(r);
		
		String s=p+q.intern();
		
		System.out.println(q+"   "+s);
		
		
		String a= new String("pawan");
		String b=a.intern();
		System.out.println(b);
	}
}
