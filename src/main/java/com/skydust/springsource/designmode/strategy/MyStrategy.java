package com.skydust.springsource.designmode.strategy;
/**
 * 策略模式，相同的实现方法，不同继承类实现则实现不同的功能
 * @author laoliangliang
 *
 */
public class MyStrategy {

	public static void main(String[] args) {
		RootStrategy strategy1 = new StrategyClass1();
		RootStrategy strategy2 = new StrategyClass2();
		strategy1.executeStrategy();
		strategy2.executeStrategy();
	}
}
