package com.String;

public class CharCheck {
public static void main(String[] args) {
	String s="my name is pawan patidar from rays";
	int j=0;
	int k=0;
	
	for(int i=0;i<s.length()-1;i++) {
		if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U') {
			j++;
		}
		if(s.charAt(i)>='a'&& s.charAt(i)<='z') {
			k++;
		}
	}
	System.out.println("vovel "+j);
	System.out.println("char "+k);
	System.out.println(s.length());
}


}
