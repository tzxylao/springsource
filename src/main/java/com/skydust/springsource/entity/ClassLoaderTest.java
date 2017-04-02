package com.skydust.springsource.entity;

import java.net.URL;

public class ClassLoaderTest {
	public static void main(String[] args) {
		System.out.println(System.getProperty("sun.boot.class.path"));
		URL[] urls = sun.misc.Launcher.getBootstrapClassPath().getURLs();  
		for (int i = 0; i < urls.length; i++) {  
		    System.out.println(urls[i].toExternalForm());  
		} 
	}
}
