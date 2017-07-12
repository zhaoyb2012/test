package com.zhaoyb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zhaoyb.domain.TestProperties;

@RestController
public class HelloController {
	
//	@Value("${testValue}")
//	private String testValue;
//	
//	@Value("${content}")
//	private String content;
	
	@Autowired
	private TestProperties testProperties;
	@RequestMapping(value={"/sayHello","hi"},method=RequestMethod.GET)
	public String sayHello(){
		return testProperties.getTestValue();
	}
}
