package com.hostmdy.di.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.hostmdy.service.GreetingService;

@Controller
public class SetterInjectedController2 {
	
	public GreetingService greetingService;
	
	public String sayHello() {
		return greetingService.sayHello();
	}

	@Autowired
	@Qualifier("setterGreetingServiceImpi")
	public void setGreetingService(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	
	

	


	
}
