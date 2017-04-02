package com.skydust.springsource.designmode.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class HelpSale implements InvocationHandler {

	private Object obj;
	
	public HelpSale(Object obj) {
		this.obj = obj;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println("we get money before sell");
		return method.invoke(obj, args);
	}

}
