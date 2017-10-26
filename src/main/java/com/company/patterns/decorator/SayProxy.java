package com.company.patterns.decorator;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class SayProxy implements InvocationHandler{

	private Say target;
	
	public SayProxy (Say target) {
		this.target = target;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		MyInfo anno = target.getClass().getMethod(method.getName(), method.getParameterTypes()).getAnnotation(MyInfo.class);
		if(anno != null) {
			System.out.println("Annotated with: "+Arrays.toString(anno.tags()));
		}
		return method.invoke(this.target,args);
	}
	
	public static Say getSayProxy(Say say) {
		Class<?> clazz= say.getClass();
		return  (Say)Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(),
				new SayProxy(say));
		
	}

}
