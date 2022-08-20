package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollegeApp {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		College c= (College) context.getBean("c1");
		
		System.out.println(c.getName());
		System.out.println(c.getDepts());
		System.out.println(c.getHods());
		System.out.println(c.getDetails());
	}
}
