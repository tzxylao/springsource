package com.skydust.springsource.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestHashCode {
	public static void main(String[] args) {
		final int prime = 31;
        int result = 1;
        int x = 100;
        int y = 100;
//        for (int i = 0; i < 382420; i++) {
//        	result = prime * result + x;
//        	result = prime * result + y;
//		}
        System.out.println(result);
        System.out.println(Integer.toBinaryString(2147483647));
        System.out.println(Integer.toBinaryString(2147483647+1)); 
        System.out.println(Integer.toBinaryString(2147483647*2));
        System.out.println(Integer.toBinaryString(2147483647*3));
        System.out.println(Integer.toBinaryString(2147483647*2147483647));
        System.out.println(Long.toBinaryString(2147483647*2147483647));
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE+1);
        String[] arg = new String[]{"a","b"};
        ArrayList list = new ArrayList();
        List<String> asList = Arrays.asList(arg);
//        asList.add(e)
        
        
        
	}
}
