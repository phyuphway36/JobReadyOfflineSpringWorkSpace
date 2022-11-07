package com.hostmdy.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.hostmdy.di.repository.GreetingRepository;

//@Service
//@Primary
public class PrimaryGreetingService implements GreetingService{

//	public static final String HELLO_WORLD = "Hello From Primary Greeting Service";
	
	private final GreetingRepository greetingRepository;
	
	

	public PrimaryGreetingService(GreetingRepository greetingRepository) {
	super();
	this.greetingRepository = greetingRepository;
}



	@Override
	public String sayHello() {
		// TODO Auto-generated method stub
		return greetingRepository.getPrimaryEnglishGreeting();
	}

}
