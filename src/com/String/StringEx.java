package com.String;

public class StringEx {
public static void main(String[] args) {
	String name = "Java Reference";
	//String s = name;
	int[] c = new int[265];
	int check = 1;
	int i,j,k,find=0;
	 //char c = 'a';
	for ( i = 0; i < name.length(); i++) {
		
		System.out.print(c[name.charAt(i)]++);

	}
	char[] ch = new char[name.length()];
	for ( j = 0; j < name.length(); j++) {
		ch[j] = name.charAt(j);
		
		for ( k = 0; k <=j; k++) {
			if (name.charAt(j) == ch[k])
			{
				find++;
		    }
//		if (find == 1) {
//
//			//System.out.println(find);
//		}
		
	}
		System.out.println(find);
}


}
}
