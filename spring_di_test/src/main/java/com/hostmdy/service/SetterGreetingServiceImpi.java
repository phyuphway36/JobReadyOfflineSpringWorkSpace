package com.hostmdy.service;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingServiceImpi implements GreetingService{

	public static final String HELLO_WORLD = "Hello From Setter Greeting Service";

	@Override
	public String sayHello() {
		// TODO Auto-generated method stub
		return HELLO_WORLD;
	}
}
