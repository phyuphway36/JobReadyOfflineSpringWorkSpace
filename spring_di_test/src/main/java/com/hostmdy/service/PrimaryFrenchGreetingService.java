package com.hostmdy.service;


import com.hostmdy.di.repository.GreetingRepository;


public class PrimaryFrenchGreetingService implements GreetingService{

//	public static final String HELLO_WORLD = "Hello From Primary Greeting Service";
	
	private final GreetingRepository greetingRepository;
	
	

	public PrimaryFrenchGreetingService(GreetingRepository greetingRepository) {
	super();
	this.greetingRepository = greetingRepository;
}



	@Override
	public String sayHello() {
		// TODO Auto-generated method stub
		return greetingRepository.getPrimaryFrenchGreeting();
	}

}
