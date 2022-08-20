package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMainClass {
	public static void main(String[] args) {
		//SOLUTION 1
		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		
		Employee e1= (Employee) context.getBean("e");
		
		System.out.println(e1);
		
		//SOLUTION2
		System.out.println(context.getBean("e"));
		
		//SOLUTION3
		System.out.println(new ClassPathXmlApplicationContext("config.xml").getBean("e"));
		
	}
}
