package com.company.list;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;

public class ListFill<T> implements InvocationHandler{

	List<T> target;
	
	T filler;
	
	public ListFill(List<T> target, T filler) {
		this.target = target;
		this.filler = filler;
	}
	
	public static <E> List<E> createFillList(List<E> list, E filler) {
		Class<?> clazz = list.getClass();
		List<E> newProxyInstance = (List<E>) Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(),
				new ListFill<E>(list, filler));
		return  newProxyInstance;
	}

	
	private void fill(int idx) {
		int size = target.size();
		if(idx >= size) {
			for(int i = size; i <= idx; i++) {
				target.add(filler);
			}
		}
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		if("get".equals(method.getName())) {
			this.fill((int)args[0]);
		} else if("add".equals(method.getName()) && args.length == 2) {
			int idx = (int)args[0];
			fill(idx - 1);
		}
		return method.invoke(this.target, args);
	}
	
}
