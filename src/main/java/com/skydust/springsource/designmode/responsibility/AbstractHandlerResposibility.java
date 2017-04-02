package com.skydust.springsource.designmode.responsibility;

public abstract class AbstractHandlerResposibility implements HandlerResposibility{
	private HandlerResposibility handler;
	
	public void setHandler(HandlerResposibility handler) {
		this.handler = handler;
	}
	
	public HandlerResposibility getHandler() {
		return handler;
	}
}
