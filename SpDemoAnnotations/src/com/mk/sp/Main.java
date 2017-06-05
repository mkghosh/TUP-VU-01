package com.mk.sp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mk.sp.beans.HelloWorldBean;

public class Main {
	
	public static void main(String[] args) {
//		ApplicationContext apc = new 
//				ClassPathXmlApplicationContext("applicationContext.xml");
//		HelloWorldBean h = (HelloWorldBean)apc.getBean("h_world");
//		System.out.println(h.getMessage());
		
		ApplicationContext apc = new ClassPathXmlApplicationContext("applicationContext.xml");
		HelloWorldBean h = (HelloWorldBean) apc.getBean("hello");
		
		System.out.println(h.getMessage());
		System.out.println(h.tellName());
	}

}
