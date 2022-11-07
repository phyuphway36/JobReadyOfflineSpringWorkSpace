package com.hostmdy.di.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.hostmdy.service.GreetingServiceImpi;

class SetterInjectedControllerTest {
	
	private SetterInjectedController2 setterInjectedController2 = 
			new SetterInjectedController2();

	@BeforeEach
	void setUp() throws Exception {
		GreetingServiceImpi greetingService = new GreetingServiceImpi();
		setterInjectedController2.setGreetingService(greetingService);
	}

	@Test
	void test() {
		assertEquals(GreetingServiceImpi.HELLO_WORLD, setterInjectedController2.sayHello());
	}

}
