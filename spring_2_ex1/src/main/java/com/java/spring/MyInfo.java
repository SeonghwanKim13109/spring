package com.java.spring;

import java.util.ArrayList;
import java.util.Iterator;

public class MyInfo {
	private String name;
	private double height;
	private double weight;
	private ArrayList hobbys;
	private BMICalculator calculator;
	
	public void getInfo() {
		// TODO Auto-generated method stub
		System.out.println("name : " + name
				+" height : " + height
				+" weight : " + weight);
		System.out.print("hobbys : ");
		Iterator iterator = hobbys.iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		System.out.println();
		calculator.bmiCalculation(height, weight);

	}
	public void setName(String name) {
		this.name = name;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public void setHobbys(ArrayList hobbys) {
		this.hobbys = hobbys;
	}
	public void setCalculator(BMICalculator calculator) {
		this.calculator = calculator;
	}
	
	
}
