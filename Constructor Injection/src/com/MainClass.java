package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		
		Student s1= (Student) context.getBean("s");
		
		System.out.println(s1);
		
		System.out.println(context.getBean("s"));
		
	}
}
