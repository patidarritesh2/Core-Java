package com.String;

final public class StringImmutable  {
	
	private final int ID;
	private final String NAME;
	
	public int getID() {
		return ID;
	}

	public String getNAME() {
		return NAME;
	}


	
	public  StringImmutable(int i,String s) {
		
		ID=i;
		NAME=s;
		
	}
	
	public static void main(String[] args) {
		 StringImmutable s=new StringImmutable(5, "Ram");
	//Z	 StringImmutable s1=new StringImmutable(15, "am");
		 System.out.println(s.getID());
		 System.out.println(s.getNAME());
	}

}
