package com.homeproj.spring.serive.impl;

import org.springframework.stereotype.Component;

import com.homeproj.spring.service.HelloWorldService;

@Component
public class HelloWorldServiceImpl implements HelloWorldService {

	public String sayHello() {
		
		return "Hello!! World";
	}
	
	

}
