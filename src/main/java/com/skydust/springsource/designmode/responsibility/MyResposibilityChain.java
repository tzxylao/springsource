package com.skydust.springsource.designmode.responsibility;

public class MyResposibilityChain {
	public static void main(String[] args) {
		ResposibilityHandler handler1 = new ResposibilityHandler("test1");
		ResposibilityHandler handler2 = new ResposibilityHandler("test2");
		ResposibilityHandler handler3 = new ResposibilityHandler("test3");
		handler1.setHandler(handler2);
		handler2.setHandler(handler3);
		handler1.handle();
	}
}
