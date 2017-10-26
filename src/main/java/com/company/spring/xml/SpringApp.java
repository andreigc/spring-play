package com.company.spring.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("services.xml");
		
		System.out.println(context.getBean("c1"));
		
		System.out.println(context.getBean("client2"));
		
		System.out.println(context.getBean("RO"));
		
		System.out.println(context.getBean("c3"));
		
		System.out.println(context.getBean("collections"));
		
	}

}
