package com.company.patterns.decorator;

public class SayUppercase implements Say {

	Say decorator;
	
	public SayUppercase(Say decorator) {
		this.decorator = decorator;
	}

	@Override
	public String hello() {
		return decorator.hello().toUpperCase();
	}
	
	
}
