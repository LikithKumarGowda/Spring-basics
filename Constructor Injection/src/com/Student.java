package com;

public class Student {
	private int studentAge;
	private String studentName;
	
	public Student(int studentAge, String studentName) {
		super();
		this.studentAge = studentAge;
		this.studentName = studentName;
	}
	
	@Override
	public String toString() {
		
		return "Age of "+studentName+" is : "+studentAge;
	}
}
