package com.java.spring;

public class Student {
	private String name;
	private int age;
	private int gradeNum;
	private int classNum;
	
	public Student(String name, int age, int gradeNum, int classNum) {
		super();
		setName(name);
		setAge(age);
		setGradeNum(gradeNum);
		setClassNum(classNum);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setGradeNum(int gradeNum) {
		this.gradeNum = gradeNum;
	}
	public void setClassNum(int classNum) {
		this.classNum = classNum;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getGradeNum() {
		return gradeNum;
	}

	public int getClassNum() {
		return classNum;
	}
	
	
}
