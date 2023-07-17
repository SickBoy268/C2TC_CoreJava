package com.cg.dayseven.overloading;

public class Calculator {
	
	public static void main(String[] args) {
		
		OverloadingCalculation oc = new OverloadingCalculation();
		
		
		System.out.println(oc.add(10, 2));
		
		System.out.println(oc.add(2.2f, 3.5f));
		
		System.out.println(oc.add(4.5, 5.5));
		
		System.out.println(oc.sub(50, 40));
		
		System.out.println(oc.sub(40.5f, 20.0f));
		
		System.out.println(oc.sub(30.3, 10.7));
		
		System.out.println(oc.mul(7, 7));
		
		System.out.println(oc.mul(0.3f, 0.5f));
		
		System.out.println(oc.mul(7.6, 4.2));
		
		System.out.println(oc.div(90, 30));
		
		System.out.println(oc.div(50.5f, 5.5f));
		
		System.out.println(oc.div(8.5, 4.8));
		
		System.out.println(oc.mod(100, 33));
		
		System.out.println(oc.mod(40.5f, 6.5f));
		
		System.out.println(oc.mod(77.3, 4.9));
	}

}
