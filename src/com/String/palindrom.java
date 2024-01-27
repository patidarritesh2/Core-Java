package com.String;
public class palindrom {
public static void main(String[] args) {
String str = "madam";	
String revrse ="";
for(int i=str.length()-1;i>=0;i--) {
	 
	revrse = revrse +str.charAt(i);
	
}
if(revrse.equals(str))
{
	System.out.println("string is palidrome");
}
else {
	System.out.println("string is not palindrome");
}

}}


