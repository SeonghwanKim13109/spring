package com.java.spring;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCalculator myCalculator = new MyCalculator();
		myCalculator.setCalculation(new Calculation());
		
		myCalculator.setFirstNum(5);
		myCalculator.setSecondNum(7);
		
		myCalculator.addition();
		myCalculator.subtraction();
		myCalculator.multiplication();
		myCalculator.division();
	}

}
