package com.java.spring;

public class StudentInfo {
	private Student student;
	
	public StudentInfo(Student student) {
		// TODO Auto-generated constructor stub
		setStudent(student);
	}

	public void getStudentInfo() {
		if(student!=null) {
			System.out.println("name : " + student.getName());
			System.out.println("age : " + student.getAge());
			System.out.println("grade : " + student.getGradeNum());
			System.out.println("class : " + student.getClassNum());
			System.out.println("=================================");
		}
	}

	public void setStudent(Student student) {
		this.student = student;
	}
}
