package com.skydust.springsource.designmode.proxy;

public class SaleObj implements Saleable{
	public void sell(String name){
		System.out.println("sell "+name);
	}
}
