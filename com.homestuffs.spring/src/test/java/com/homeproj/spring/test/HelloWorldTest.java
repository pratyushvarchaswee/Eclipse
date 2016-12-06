package com.homeproj.spring.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.homeproj.spring.config.SpringCofigClass;
import com.homeproj.spring.service.HelloWorldService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringCofigClass.class)
public class HelloWorldTest {
	@Autowired
	HelloWorldService hw;

	@Test
	public void test() {
	String st=	hw.sayHello();
	
	Assert.assertNotNull(st);
	}

}
