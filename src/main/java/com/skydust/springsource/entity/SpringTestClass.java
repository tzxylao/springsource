package com.skydust.springsource.entity;

public class SpringTestClass {
	
	public SpringTestClass() {
		System.out.println("执行SpringTestClass构造函数！");
	}

	private String name;
	
	private String id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public void load(){
		System.out.println("执行init-method方法，执行load方法");
		this.id = "123";
		this.name = "sky";
	}

	@Override
	public String toString() {
		return "SpringTestClass [name=" + name + ", id=" + id + "]";
	}
	
}
