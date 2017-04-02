package com.skydust.springsource.test;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Assert;

public class Test {
	public static void main(String[] args) {
		int av = Runtime.getRuntime().availableProcessors();
		System.out.println(av);   
		String[] arr = {"1","2"};
		try {
			System.out.println(arr[3]);
		} catch (Exception e) {
			System.out.println("e");
		}
//		Assert.assertNull(av);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String format = sdf.format(new Date());
		System.out.println(format);
	}
}
