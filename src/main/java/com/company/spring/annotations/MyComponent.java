package com.company.spring.annotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("person")
@PropertySource("classpath:gigi.properties")
public class MyComponent {

	@Value("${component.name}")
	private String name;
	
	@Value("${component.age}")
	private String age;
	
	@Value("${component.address}")
	private String address;

	@Override
	public String toString() {
		return "MyComponent [name=" + name + ", age=" + age + ", address=" + address + "]";
	}
	
	
	
	
}
