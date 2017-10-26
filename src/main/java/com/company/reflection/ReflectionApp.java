package com.company.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

import com.company.hello.PersonInterface;
import com.company.hello.Person;

public class ReflectionApp {
	
	public static void main(String[] args) {
		Class<Person> clazz = Person.class;
		
	//	introspection(clazz);
	//  reflectionCall(clazz)
		
		Person ionel = new Person("IonelK", 32);
		
		PersonInterface forbiddenPerson = ForbiddenPerson.createForbiddenPerson(ionel);
		forbiddenPerson.printName();
		
	}
	
	public static void reflectionCall(Class<Person> clazz) {
		try {
			Constructor<Person> constructor = clazz.getConstructor(String.class, int.class);
			
			PersonInterface gigel = constructor.newInstance("Gigel", 40);
			
			Method m =clazz.getMethod("printName", String.class);
			
			m.invoke(gigel, "Micul");
			
			System.out.println(gigel);
			
		} catch (NoSuchMethodException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void introspection(Class<Person> clazz2) {
		Class<Person> clazz = Person.class;
		
		Constructor<?>[] constructors = clazz.getConstructors();
		System.out.println(Arrays.toString(constructors));
		
		Method[] methods = clazz.getMethods();
		
		Arrays.stream(methods).
			forEach( method -> {
//				System.out.println(method.getName());
				
				Class<?>[] params = method.getParameterTypes();
				System.out.println(String.format("Method %s with params %s",method.getName(), Arrays.toString(params)));
				
			});
		
		Field[] fields = clazz.getDeclaredFields();
		
		Arrays.stream(fields).forEach(field -> {
			System.out.println(String.format("Field %s %s", field.getName(), field.getType()));
		});
		
	}
	
}
