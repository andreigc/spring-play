package com.company.hello;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

public class MemoisationPerson implements InvocationHandler{

	Map<Integer, Float> map = new HashMap<>();
	
	Person target;
	
	MemoisationPerson(Person person) {
		this.target = person;
	}
	
	public static PersonInterface createMemoPerson(Person person) {
		Class<Person> clazz = Person.class;
		return  (PersonInterface) Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(),
				new MemoisationPerson(person));
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		if(method.getName() == "computeTaxes" && args.length == 1) {
			if(map.containsKey(args[0])) {
				System.out.println("already computed. retrieving from cache");
				return map.get(args[0]);
			} else {
				System.out.println("computing and saving to cache");
				Float result = (Float) method.invoke(this.target, args);
				map.put((Integer)args[0], result);
				return result;
			}
		}
		return method.invoke(this.target, args);
	}
	
}
