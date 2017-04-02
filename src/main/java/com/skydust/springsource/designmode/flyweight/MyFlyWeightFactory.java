package com.skydust.springsource.designmode.flyweight;

import com.skydust.springsource.entity.Point;

/**
 * 享元模式，类似数据库连接池，创建对象池，需要时直接拿来用
 * @author laoliangliang
 *
 */
public class MyFlyWeightFactory {
	public static void main(String[] args) {
		FlyWeightFactory factory = new FlyWeightFactory();
		Point flyWeightPoint = factory.getFlyWeightPoint();
		System.out.println(flyWeightPoint);
	}
}
