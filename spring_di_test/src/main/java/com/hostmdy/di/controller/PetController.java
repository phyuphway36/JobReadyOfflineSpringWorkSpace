package com.hostmdy.di.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.hostmdy.service.PetService;

@Controller
public class PetController {
	
	private final  PetService petService;

	public PetController(@Qualifier("catServiceImpl") PetService petService) {
		super();
		this.petService = petService;
	}
	
	public String getPetType() {
		return petService.getPetType();
		
		
	}
	
	
	

}
