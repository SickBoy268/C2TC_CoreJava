package com.cg.day6.Final;

public class FinalMethod {
	 
	final static int a;
	final int b;
	
	FinalMethod () {
		
		System.out.println("a is Intialization in the Static Block."); //a is final static
		System.out.println("b is Intialization in the Constructor."); //b is final
		b = 5;
	}
	
	static {
		a = 10;
	}

	@Override
	public String toString() {
		return "FinalMethod [a =" + a + ", b =" + b + "]";
	}
	
	

}
