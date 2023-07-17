package com.cg.day6.Static;

public class StaticMethod {
	
	private int no;
	private static int reg;
	
	StaticMethod () {
		System.out.println("Default Block");
		no++;
		reg++;
	}
	
	static {
		System.out.println("Static Block");
		//no++; non-static variable cannot be assigned to station block
		reg++;
		reg = 1000;
	}

	@Override
	public String toString() {
		return "StaticMethod [no = " + no + ",reg = " + reg + "]";
	}
	
	static void display() {
		System.out.println("reg = " + reg);
		//System.out.println("no = " + no); Cannot not be accessed inside static method 
	}
}
