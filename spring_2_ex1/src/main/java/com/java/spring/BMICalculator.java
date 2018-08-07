package com.java.spring;

public class BMICalculator {
	private double lowweight;
	private double normal;
	private double overweight;
	private double obesity;
	
	public void bmiCalculation(double height, double weight) {
		double h = height * 0.01;
		double result = weight/(h*h);
		
		System.out.println("BMI index : " + result);
		
		if(result > obesity)
			System.out.println("you r obesity");
		else if(result > overweight)
			System.out.println("you r overweight");
		else if(result > normal)
			System.out.println("you r normal");
		else
			System.out.println("you r lowweight");
	}

	public void setLowweight(double lowweight) {
		this.lowweight = lowweight;
	}

	public void setNormal(double normal) {
		this.normal = normal;
	}

	public void setOverweight(double overweight) {
		this.overweight = overweight;
	}

	public void setObesity(double obesity) {
		this.obesity = obesity;
	}

	
	
}
