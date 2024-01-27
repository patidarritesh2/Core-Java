package com.Exception;

public class TryWithFinally {

	public static void main(String[] args) {
		
		String s = "vishu";
		try {
			
			s.charAt(4);
			System.out.println("mjmjmjj");
	//		System.exit(0);
		} finally  {
	System.out.println("end of program");
		}
		
	}
}
