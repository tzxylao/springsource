package com.skydust.springsource.designmode.iterator;


/**
 * 迭代子模式，模拟了集合的迭代方式
 * @author laoliangliang
 *
 */
public class TestItertor {
	public static void main(String[] args) {
		
		Collection collection = new MyLinkedList();
		IIterator iterator = collection.iterator();
		while(iterator.hasNext()){
			Object next = iterator.next();
			System.out.println(next);
		}
	}
}
