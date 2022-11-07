package com.hostmdy.di.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.hostmdy.service.GreetingServiceImpi;



class PropertyInjectedControllerTest {
	private PropertyInjectedController propertyInjectedController= 
			new PropertyInjectedController();

	@BeforeEach
	void setUp() throws Exception {
		GreetingServiceImpi greetingServiceImpi = new GreetingServiceImpi();
		propertyInjectedController.greetingService = greetingServiceImpi;
	}

	@Test
	void test() {
		assertEquals(GreetingServiceImpi.HELLO_WORLD, propertyInjectedController.sayHello());
	}

}
