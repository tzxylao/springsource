package com.skydust.springsource.designmode.template;
/**
 * 模板模式，父类调用子类的方法，子类去具体实现该方法
 * @author laoliangliang
 *
 */
public class MyTemplate extends AbstractTemplate{

	@Override
	protected void runTemplate() {
		System.out.println("runTemplate--MyTemplate");
	}
	public static void main(String[] args) {
		MyTemplate temp = new MyTemplate();
		temp.execute();
	}
}
