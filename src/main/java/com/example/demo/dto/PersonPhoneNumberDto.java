package com.example.demo.dto;

import java.util.List;

import lombok.Data;

@Data
public class PersonPhoneNumberDto {

	private String name;
	private String email;
	private String address;
	private List<String> phoneNumbers;

}
