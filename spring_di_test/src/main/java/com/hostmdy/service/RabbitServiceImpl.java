package com.hostmdy.service;

import org.springframework.stereotype.Service;

//@Service
public class RabbitServiceImpl implements PetService{

	@Override
	public String getPetType() {
		// TODO Auto-generated method stub
		return "Rabbit : cute creature";
	}

}
