package com.String;

public class StringCount {
	public static void main(String[] args) {
		String s= "Pawan Patidar";
		int j=0;
		
		for( int i=0;i<s.length();i++){
			
			char c=s.charAt(i);
			String k=String.valueOf(c);
			
			
			if(k.matches("P")) {
				j++;
			}
			
			
			//System.out.println(s.);
			
			//System.out.print(s.charAt(i));
			
			
			
		}
		
		System.out.println(j);
		
		
		
		/*String s3="paWan";
		String s4="pawan";
	   int i2=s3.compareTo(s4);
	   System.out.println(i2);
		System.out.println("---------String Buffer--------");
		
		StringBuffer sb= new StringBuffer("Pawan"); 
		System.out.println(sb.reverse());
	      */
		
	}
}
