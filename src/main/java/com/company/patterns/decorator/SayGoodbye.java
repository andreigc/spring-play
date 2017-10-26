package com.company.patterns.decorator;

public class SayGoodbye implements Say{

	@Override
//	@MyInfo(tags = {"tag"})
	public String hello() {
		return "Bye";
	}
	
}
