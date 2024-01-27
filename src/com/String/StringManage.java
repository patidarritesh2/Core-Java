package com.String;

import java.util.Arrays;

public class StringManage {


public static void main(String[] args) {
	String[] s={"THIS","IS","CORE","JAVA"};
	 //  int size=s.length;
	 //  System.out.println(Arrays.toString(s));
	
	 for(int i=0;i<s.length-1;i++)
	 {
		 for(int j=i+1;j<s.length;j++)
		 {
			 if(s[i].compareTo(s[j])>0)
			 {
				 String temp=s[i];
				
				 s[i]=s[j];
				 s[j]=temp;
				
			 }
			 //System.out.println(s[j]);
		 }
	 }
	 
 System.out.println(Arrays.toString(s));
 System.out.println("------------------------------");
 String s2= "Pawan Patidar";
	int i;
	
	for( i=s2.length()-1;i>=0;i--){
		
		System.out.print(s2.charAt(i));
		
		
		
	}
	
	String s3="pawan";
	String s4="pawan";
	   int i2=s4.compareTo(s3);
	   System.out.println(i2);
		
}
}
