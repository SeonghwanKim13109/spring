package com.java.spring;

public class MyCalculator {
	Calculator calculator;
	private int firstNum;
	private int secondNum;
	
	public void addition() {
		calculator.addition(firstNum,secondNum);
	}
	
	public void subtraction() {
		calculator.subtraction(firstNum,secondNum);
	}
	
	public void multiplication() {
		calculator.multiplication(firstNum,secondNum);
	}
	
	public void division() {
		calculator.division(firstNum,secondNum);
	}
	
	public void setFirstNum(int firstNum) {
		this.firstNum = firstNum;
	}

	public void setSecondNum(int secondNum) {
		this.secondNum = secondNum;
	}
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}
	
	public MyCalculator() {
		// TODO Auto-generated constructor stub
	}
}
