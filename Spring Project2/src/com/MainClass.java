package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
		Student s=(Student) context.getBean("s1");
		System.out.println("Student Id is : "+s.getId());
		System.out.println("Student subjects are : "+s.getSubjects());
	}
}
