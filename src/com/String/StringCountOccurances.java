package com.String;

public class StringCountOccurances {

	public static void main(String[] args) {

		String s1 = "JAjava";
		int count = 0;
		String s=s1.toLowerCase();

		for (char a = 'a'; a <= 'z'; a++) {
		
			for ( int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == a) {
					count++;
				}
			} 
			if(count!=0)
			System.out.println(a+"="+count);
			
	    	 count=0;
		}
	}
	
}
