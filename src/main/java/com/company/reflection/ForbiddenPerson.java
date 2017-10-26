package com.company.reflection;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.List;

import com.company.hello.Person;
import com.company.hello.PersonInterface;

public class ForbiddenPerson implements InvocationHandler{
	
	private PersonInterface target;
	
	private final List<String> permitted = Arrays.asList(new String[] {"printName"});
	
	public ForbiddenPerson(PersonInterface person) {
		this.target = person;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable
	{
		String methodName = method.getName();
		//if("printName".equals(methodName) && method.getParameterCount() != 0) {
		//	throw new Exception("Not permitted without parameters");
		//}
		if(permitted.contains(methodName)) {
			return method.invoke(this.target, args);
		}
		throw new Exception("Not permitted");
		
	}
		
	
	public static PersonInterface createForbiddenPerson(PersonInterface person) {
		
		Class<Person> clazz = Person.class;
		
		PersonInterface reflectionPerson = (PersonInterface)Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(),
				new ForbiddenPerson(person));
		
		return reflectionPerson;
	}


}
