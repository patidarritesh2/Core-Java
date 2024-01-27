package com.String;

public class StringCountOccurances2 {
	
	public static void main(String[] args) {
		
		String s = "Aadarsh";
		int count = 0;
		char [] ch = s.toCharArray();
		
		
		for (char c : ch) {
			
			for (int i = 0; i < ch.length; i++) {
				if (ch[i]==c) {
					count++;
				}
			}
			System.out.println(c + "=" + count);
			count = 0;
		}
		
	}

}
