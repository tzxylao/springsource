package com.skydust.springsource.test;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ApplicationEventMulticaster;

public class ApplicationEventMulticasterTest implements ApplicationEventMulticaster{

	@Override
	public void addApplicationListener(ApplicationListener<?> listener) {
		// TODO Auto-generated method stub
		System.out.println("ApplicationEventMulticaster test");
	}

	@Override
	public void addApplicationListenerBean(String listenerBeanName) {
		// TODO Auto-generated method stub
		System.out.println("ApplicationEventMulticaster test");
	}

	@Override
	public void removeApplicationListener(ApplicationListener<?> listener) {
		// TODO Auto-generated method stub
		System.out.println("ApplicationEventMulticaster test");
	}

	@Override
	public void removeApplicationListenerBean(String listenerBeanName) {
		// TODO Auto-generated method stub
		System.out.println("ApplicationEventMulticaster test");
	}

	@Override
	public void removeAllListeners() {
		// TODO Auto-generated method stub
		System.out.println("ApplicationEventMulticaster test");
	}

	@Override
	public void multicastEvent(ApplicationEvent event) {
		// TODO Auto-generated method stub
		Object source = event.getSource();
		System.out.println("ApplicationEventMulticaster test");
	}

}
