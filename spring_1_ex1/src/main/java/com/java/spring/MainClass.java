package com.java.spring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*MyCalculator myCalculator = new MyCalculator();
		myCalculator.setCalculation(new Calculation());
		
		myCalculator.setFirstNum(5);
		myCalculator.setSecondNum(7);
		
		myCalculator.addition();
		myCalculator.subtraction();
		myCalculator.multiplication();
		myCalculator.division();*/
		
		String configLocation = "classpath:applicationCTX.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);
		
		MyCalculator myCalculator = ctx.getBean("myCalculator",MyCalculator.class);
		
		myCalculator.addition();
		myCalculator.subtraction();
		myCalculator.multiplication();
		myCalculator.division();
	}

}
