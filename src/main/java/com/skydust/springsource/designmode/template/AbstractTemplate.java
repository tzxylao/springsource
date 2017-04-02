package com.skydust.springsource.designmode.template;

public abstract class AbstractTemplate implements Template {

	@Override
	public void execute() {
		System.out.println("abstractTemplate---execute--start");
		runTemplate();
		System.out.println("abstractTemplate---execute--end");
	}
	
	protected abstract void runTemplate();

}
