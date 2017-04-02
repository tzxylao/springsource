package com.skydust.springsource.aop;

import org.aspectj.lang.JoinPoint;


public class  LogAspect {
	public void doBefore(JoinPoint point){
		System.out.println("doBefore--"+point.getClass().getName()+","+point.getThis().getClass().getName());
	}
}
