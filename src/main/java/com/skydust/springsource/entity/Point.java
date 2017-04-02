package com.skydust.springsource.entity;

import java.util.HashSet;
import java.util.Set;

public class Point {
    private int x;
    private int y;
    
    public Point(int x, int y) {
        super();
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    
    @Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	@Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + x;
        result = prime * result + y;
        return super.hashCode();
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Point other = (Point) obj;
        if (x != other.x)
            return false;
        if (y != other.y)
            return false;
        return true;
    }
    public static void main(String[] args) {
        Point point1=new Point(1,2);
        Point point2=new Point(2,3);
        Point point3=new Point(1,2);
        Set<Point> set=new HashSet<Point>();
        set.add(point1);
        set.add(point2);
        System.out.println(set.contains(point3));
        set.add(point3);
//        System.out.println(set.size());//3
//        point1.setX(5);//改变 point1的x值
//        set.remove(point1);//移除 point1
//        System.out.println(set.size());//3
        System.out.println(set);
    }
}