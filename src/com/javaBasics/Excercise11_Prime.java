package com.javaBasics;

public class Excercise11_Prime {
	public static void main(String[] args) {
		
	
int n=37;
int prime=0;

for(int i=2;i<=n-1;i++) {
	if(n%i==0) {
	prime=prime+1;
}
}
if(prime==0) {
	System.out.println("prime");
}else {
	System.out.println("not prime");
}


}
}