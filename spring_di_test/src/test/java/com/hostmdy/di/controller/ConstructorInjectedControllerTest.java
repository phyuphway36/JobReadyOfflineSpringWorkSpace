package com.hostmdy.di.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.hostmdy.service.GreetingServiceImpi;

class ConstructorInjectedControllerTest {
	private ConstructorInjectedController constructorInjectedController;

	@BeforeEach
	void setUp() throws Exception {
		GreetingServiceImpi greetingServiceImpi = new GreetingServiceImpi();
		constructorInjectedController = new ConstructorInjectedController(greetingServiceImpi);
	}

	@Test
	void test() {
	assertEquals(GreetingServiceImpi.HELLO_WORLD, constructorInjectedController.sayHello());
	}

}
