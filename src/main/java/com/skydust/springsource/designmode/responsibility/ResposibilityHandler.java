package com.skydust.springsource.designmode.responsibility;

public class ResposibilityHandler extends AbstractHandlerResposibility {

	private String name ;
	public ResposibilityHandler(String name) {
		this.name = name;
	}
	@Override
	public void handle() {
		System.out.println(name + " execute");
		if(getHandler() != null){
			getHandler().handle();
		}
	}
}

	