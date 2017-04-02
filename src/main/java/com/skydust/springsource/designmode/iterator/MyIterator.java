package com.skydust.springsource.designmode.iterator;

public class MyIterator implements IIterator{

	private Collection collection;
	
	private int index = -1;
	
	public MyIterator(Collection collection) {
		this.collection = collection;
	}
	@Override
	public boolean hasNext() {
		int size = collection.size();
		if(index < size-1){
			return true;
		}
		return false;
	}

	@Override
	public Object next() {
		++index;
		Object object = collection.get(index);
		return object;
	}

	@Override
	public Object previous() {
		return null;
	}

	@Override
	public Object first() {
		return collection.get(0);
	}
}
