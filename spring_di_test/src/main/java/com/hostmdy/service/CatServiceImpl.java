package com.hostmdy.service;

import org.springframework.stereotype.Service;

//@Service
public class CatServiceImpl implements PetService{

	@Override
	public String getPetType() {
		// TODO Auto-generated method stub
		return "Cat: the pet like your crush";
	}

}
