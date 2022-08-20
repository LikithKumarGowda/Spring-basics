package com.project;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		
		//  Mobile project
		Mobile m1=(Mobile) context.getBean("m1");
		System.out.println("Brand :"+m1.getBrand());
		System.out.println("Cost : "+m1.getCost());
		
		//Person project
		Person p1=(Person) context.getBean("p1");
		System.out.println("Age :"+p1.getAge());
		System.out.println("Name : "+p1.getName());
		
	}
}
