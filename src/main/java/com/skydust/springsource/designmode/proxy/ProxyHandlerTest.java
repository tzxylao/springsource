package com.skydust.springsource.designmode.proxy;

import java.lang.reflect.Proxy;

public class ProxyHandlerTest {
	public static void main(String[] args) {
		SaleObj obj = new SaleObj();
		Saleable sale = (Saleable) Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), 
				new HelpSale(obj));
		sale.sell("apple");
	}
}
