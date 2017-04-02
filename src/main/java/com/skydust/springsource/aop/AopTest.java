package com.skydust.springsource.aop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopTest {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext-aop-test.xml");
		BeAspectObject bean = (BeAspectObject) ctx.getBean("beAspectObject");
		bean.dosomething();
		bean.dosomething();
	}
}
