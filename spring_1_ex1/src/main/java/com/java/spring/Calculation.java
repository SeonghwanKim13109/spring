package com.java.spring;

public class Calculation {
	private int firstNum;
	private int secondNum;
	
	public Calculation(int firstNum, int secondNum) {
		super();
		this.firstNum = firstNum;
		this.secondNum = secondNum;
	}

	public void addition() {
		System.out.println("Addition");
		System.out.println(firstNum+" + "+secondNum+" = " +(firstNum+secondNum));
	}
	
	public void subtraction() {
		System.out.println("Subtraction");
		System.out.println(firstNum+" - "+secondNum+" = " +(firstNum-secondNum));
	}
	
	public void multiplication() {
		System.out.println("Multiplication");
		System.out.println(firstNum+" * "+secondNum+" = " +(firstNum*secondNum));
	}
	
	public void division() {
		System.out.println("Division");
		System.out.println(firstNum+" / "+secondNum+" = " +(firstNum/secondNum));
	}
}
