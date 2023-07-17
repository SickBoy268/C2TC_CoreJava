package com.cg.daytwo;

public class NestedIfCond {
	
	public static void main(String[] args) {
		
		int a = 1, b = 2;
		if(a < b) {
			System.out.println(a);
			if(b > a) {
				System.out.println(b);
			}
		}
		
	}

}
