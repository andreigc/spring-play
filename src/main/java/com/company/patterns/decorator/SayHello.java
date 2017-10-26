package com.company.patterns.decorator;

public class SayHello implements Say{

	@Override
	@MyInfo(tags ={"Test", "t"})
	public String hello() {
		return "Hello";
	}
	
}
