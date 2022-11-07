package com.hostmdy.di.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.hostmdy.service.GreetingService;

@Controller
public class ConstructorInjectedController {
	
	public GreetingService greetingService;
	
	
	
	@Autowired
	
	public ConstructorInjectedController(@Qualifier("constructorGreetingService")  GreetingService greetingService) {
		super();
		this.greetingService = greetingService;
	}

	public String sayHello() {
		return greetingService.sayHello();
	}

	
	
}
