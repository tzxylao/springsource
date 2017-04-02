package com.skydust.springsource.designmode.iterator;

public interface Collection {
	IIterator iterator();
	
	int size();
	
	Object get(int i);
}
