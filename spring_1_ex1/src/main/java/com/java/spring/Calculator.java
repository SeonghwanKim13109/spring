package com.java.spring;

public class Calculator {
	
	public Calculator() {
		super();
	}

	public void addition(int firstNum, int secondNum) {
		System.out.println("Addition");
		System.out.println(firstNum+" + "+secondNum+" = " +(firstNum+secondNum));
	}
	
	public void subtraction(int firstNum, int secondNum) {
		System.out.println("Subtraction");
		System.out.println(firstNum+" - "+secondNum+" = " +(firstNum-secondNum));
	}
	
	public void multiplication(int firstNum, int secondNum) {
		System.out.println("Multiplication");
		System.out.println(firstNum+" * "+secondNum+" = " +(firstNum*secondNum));
	}
	
	public void division(int firstNum, int secondNum) {
		System.out.println("Division");
		System.out.println(firstNum+" / "+secondNum+" = " +(firstNum/secondNum));
	}
}
