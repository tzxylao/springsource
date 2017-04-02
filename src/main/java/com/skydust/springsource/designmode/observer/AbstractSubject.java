package com.skydust.springsource.designmode.observer;

import java.util.Enumeration;
import java.util.Vector;

public abstract class AbstractSubject implements Subject {

	private Vector<Observer> observers = new Vector<Observer>();
	
	@Override
	public void notifyObserver() {
		Enumeration<Observer> elements = observers.elements();
		while(elements.hasMoreElements()){
			Observer nextElement = elements.nextElement();
			nextElement.update();
		}
	}
	
	public void addObserver(Observer server){
		observers.add(server);
	}

}
