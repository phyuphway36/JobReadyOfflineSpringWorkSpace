package com.hostmdy.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpi implements GreetingService{
	
	public static final String HELLO_WORLD = "Hello From Original Greeting Service";

	@Override
	public String sayHello() {
		// TODO Auto-generated method stub
		return HELLO_WORLD;
	}

}
