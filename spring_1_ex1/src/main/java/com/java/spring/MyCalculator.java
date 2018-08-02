package com.java.spring;

public class MyCalculator {
	Calculation calculation;
	private int firstNum;
	private int secondNum;
	
	public void addition() {
		calculation.addition();
	}
	
	public void subtraction() {
		calculation.subtraction();
	}
	
	public void multiplication() {
		calculation.multiplication();
	}
	
	public void division() {
		calculation.division();
	}
	
	public void setFirstNum(int firstNum) {
		this.firstNum = firstNum;
	}

	public void setSecondNum(int secondNum) {
		this.secondNum = secondNum;
	}
	public void setCalculation(Calculation calculation) {
		this.calculation = calculation;
	}
	
	
}
