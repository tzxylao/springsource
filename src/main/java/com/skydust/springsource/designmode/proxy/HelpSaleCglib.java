package com.skydust.springsource.designmode.proxy;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class HelpSaleCglib implements MethodInterceptor {

	private Object obj;
	
	public HelpSaleCglib(Object obj) {
		this.obj = obj;
	}
	@Override
	public Object invoke(MethodInvocation arg0) throws Throwable {
		System.out.println("we get money before sell");
		return null;
	}

}
