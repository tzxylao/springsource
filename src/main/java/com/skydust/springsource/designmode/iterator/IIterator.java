package com.skydust.springsource.designmode.iterator;

public interface IIterator {
	boolean hasNext();
	
	Object next();
	
	Object previous();
	
	Object first();
}
