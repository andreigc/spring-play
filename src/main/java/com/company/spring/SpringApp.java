package com.company.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("services.xml");
		
		HelloWorld hello = context.getBean("helloWorld", HelloWorld.class);
		
		System.out.println(hello.getMessage());
		
	}
	
}
