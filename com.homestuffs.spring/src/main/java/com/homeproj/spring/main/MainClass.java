package com.homeproj.spring.main;

import org.springframework.beans.factory.annotation.Autowired;

import com.homeproj.spring.service.HelloWorldService;

public class MainClass {
//	@Autowired
//	static HelloWorldService hw;
	
	@Autowired		
	 static HelloWorldService hw;

	public static void main(String[] args) {


		String tmp = hw.sayHello();

		System.out.println("Tmp" + tmp);
	}

}
