package com.skydust.springsource.javasource;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConcurrentHashMapReslover {
	private static Integer count = 0;
	private static final String str = "count";
	public static void main(String[] args) {
		ExecutorService exe = Executors.newFixedThreadPool(10);
		Map<String, Integer> map = new ConcurrentHashMap<String, Integer>();
		for (int i = 0; i < 10; i++) {
			exe.execute(new Runnable() {
				@Override
				public void run() {
					Integer con = map.get(str);
					System.out.println(con);
					if(con == null){
						map.put(str, count);
					}else{
						con ++;
						map.put(str, count);
					}
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
				}
			});
		}
	}
}
