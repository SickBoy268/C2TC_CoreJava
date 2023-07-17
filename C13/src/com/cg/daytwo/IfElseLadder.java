package com.cg.daytwo;

public class IfElseLadder {

	public static void main(String[] args) {
		
		int a = 7, b = 5, c = 1;
		if (a > b  &&  a > c) {
			System.out.println("A is the Greatest Number.");
		}
		else if (b > c) {
			System.out.println("B is the Greatest Number.");
		}
		else {
			System.out.println("C is the Grestest Number.");
		}
	}

}
