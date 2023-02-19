package com.codewithkd.blog.payloads;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class UserDto {

	//Get all data from User 
	//Set by User
	private int id;
	private String name;
	private String email;
	private String password;
	private String about;
	
	
}
