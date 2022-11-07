package com.hostmdy.property.bean;

import lombok.Value;

//DTO
@Value
public class DataTransferTest {

	  int id;
	  String name;
	  String email;
	  
	public DataTransferTest(int id, String name, String email) {
		super();
		System.out.println("Inside Manual All Args constructor");
		this.id = id;
		this.name = name;
		this.email = email;
	}
	  
	  
	
	
	
	
}
