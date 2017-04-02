package com.skydust.springsource.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.skydust.springsource.entity.SpringTestClass;

public class SpringTest {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext-init_loader.xml");
		SpringTestClass bean = (SpringTestClass) ctx.getBean("springTestClass");
		System.out.println(bean.toString());
	}
}
