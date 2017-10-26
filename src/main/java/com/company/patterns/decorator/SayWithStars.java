package com.company.patterns.decorator;

public class SayWithStars implements Say {
	
	private final Say delegate;
	
	public SayWithStars(Say delegate) {
		this.delegate = delegate;
	}

	@Override
	public String hello() {
		return String.format("**%s**", delegate.hello());
	}
	

}
