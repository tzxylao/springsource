package com.skydust.springsource.designmode.iterator;

public class MyLinkedList implements Collection{

	private String[] str = {"1","2","3"};
	@Override
	public IIterator iterator() {
		return new MyIterator(this);
	}

	@Override
	public int size() {
		return str.length;
	}

	@Override
	public Object get(int i) {
		if(i<size() && i>=0){
			return str[i];
		}
		return null;
	}
	
}
