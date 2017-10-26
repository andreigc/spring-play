package com.company.patterns.decorator;

public class DecoratorApp {

	public static void main(String[] args) {
		Say hi = new SayHello();
		Say bye = new SayGoodbye();
		
		Say hiWithStars = new SayWithStars(hi);
		
		Say byeUpper = new SayUppercase(bye);
		
		System.out.println(hi.hello());
		System.out.println(bye.hello());
		System.out.println(hiWithStars.hello());
		System.out.println(byeUpper.hello());
		
		Say anno = SayProxy.getSayProxy(hi);
		System.out.println(anno.hello());
		
		Say annoB = SayProxy.getSayProxy(bye);
		System.out.println(annoB.hello());
	}
	
}
