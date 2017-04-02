package com.skydust.springsource.designmode.flyweight;

import java.util.LinkedList;
import java.util.List;

import com.skydust.springsource.entity.Point;

public class FlyWeightFactory {
	private List<Point> points;
	
	private int size = 10;
	
	public FlyWeightFactory() {
		init();
	}

	private void init() {
		if(points == null){
			points = new LinkedList<Point>();
			for (int i = 0; i < size; i++) {
				Point p = new Point(i, i*2);
				points.add(p);
			}
		}
	}
	
	public synchronized Point getFlyWeightPoint(){
		System.out.println(points);
		if(points.size()>0){
			Point point = points.get(0);
			points.remove(point);
			return point;
		}
		return null;
	}
}
