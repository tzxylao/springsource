package com.skydust.springsource.test;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.SmartApplicationListener;

public class SmartApplicationListenerTest implements SmartApplicationListener{

	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		// TODO Auto-generated method stub
		System.out.println("SmartApplicationListener test");
	}

	@Override
	public int getOrder() {
		// TODO Auto-generated method stub
		System.out.println("SmartApplicationListener test");
		return 0;
	}

	@Override
	public boolean supportsEventType(Class<? extends ApplicationEvent> eventType) {
		// TODO Auto-generated method stub
		System.out.println("SmartApplicationListener test");
		return false;
	}

	@Override
	public boolean supportsSourceType(Class<?> sourceType) {
		// TODO Auto-generated method stub
		System.out.println("SmartApplicationListener test");
		return false;
	}

}
