package com.hostmdy.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

//@Service("i18nGreeting")//bean name pay tar
//@Profile("KR")
public class I18nKoreaGreetingServiceImpl implements GreetingService{

	@Override
	public String sayHello() {
		// TODO Auto-generated method stub
		return "Anyarsayaw : Korea Greeting";
	}

}
