package com.ExceptionVip;

public class SingleCatchMulException {

	public static void main(String[] args) {
		
		String s = "vipin";
		String g = null;
		//g.length();
		try {
			System.out.println("hrrr");
			System.out.println(g.length());
			System.out.println("tu ni chalega baba");
		} catch (NullPointerException|StringIndexOutOfBoundsException e) {
			System.out.println("me chala re");
			System.out.println(e.getMessage());
			
		}
	}
}
